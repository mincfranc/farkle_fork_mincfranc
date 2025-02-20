package edu.cnm.deepdive.slidingtiles.model.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.cnm.deepdive.slidingtiles.model.domain.Box.Position;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class BoxTest {

  @ParameterizedTest
  @ValueSource(ints = {1, 0, -1, Integer.MIN_VALUE})
  void init_invalid(int size) {
    assertThrows(BoxTooSmallException.class, () -> new Box(size, new Random()));
  }

  @ParameterizedTest
  @ValueSource(ints = {2, 3, 4, 5, 6})
  void init_valid(int size) {
    Box box = new Box(size, new Random());
    Stream<Executable> executables = IntStream.range(0, size * size)
        .mapToObj((tile) -> {
          Position pos = box.getPositionOfTile(tile);
          return () -> assertEquals(tile, box.getTileAtPosition(pos));
        });
    assertAll(Stream.concat(
        Stream.of(
            () -> assertEquals(size, box.size()),
            () -> assertFalse(box.isSolved())
        ),
        executables
    ));
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        Position pos = new Position(row, col);
        int tile = box.getTileAtPosition(pos);
        assertEquals(pos, box.getPositionOfTile(tile));
      }
    }
  }

  @ParameterizedTest
  @CsvFileSource(resources = {"slide-non-existent.csv"}, useHeadersInDisplayName = true)
  void slide_nonexistentTile(int size, int tile) {
    Box box = new Box(size, new Random());
    assertThrows(NonexistentTileException.class, () -> box.slide(tile));
  }

  @ParameterizedTest
  @ValueSource(ints = {2, 3, 4, 5, 6})
  void slide_tileCantSlide(int size) {
    Random rng = new Random();
    Box box = new Box(size, rng);
    Position emptySpace = box.getPositionOfTile(0);
    int tile;
    Position tilePosition;
    do {
      tile = 1 + rng.nextInt(size * size - 1);
      tilePosition = box.getPositionOfTile(tile);
    } while (tilePosition.isAdjacentTo(emptySpace));
    int badTile = tile;
    assertThrows(TileCantSlideException.class, () -> box.slide(badTile));
  }

  @ParameterizedTest
  @ValueSource(ints = {2, 3, 4, 5, 6})
  void slide_tileCanSlide(int size) {
    Random rng = new Random();
    Box box = new Box(size, rng);
    Position emptySpace = box.getPositionOfTile(0);
    int tile;
    Position tilePosition;
    do {
      tile = 1 + rng.nextInt(size * size - 1);
      tilePosition = box.getPositionOfTile(tile);
    } while (!tilePosition.isAdjacentTo(emptySpace));
    box.slide(tile);
    int movedTile = tile;
    Position prevTilePosition = tilePosition;
    assertAll(
        () -> assertEquals(emptySpace, box.getPositionOfTile(movedTile)),
        () -> assertEquals(prevTilePosition, box.getPositionOfTile(0))
    );
  }

}