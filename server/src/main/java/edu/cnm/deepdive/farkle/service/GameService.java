package edu.cnm.deepdive.farkle.service;

import edu.cnm.deepdive.farkle.model.dao.GameRepository;
import edu.cnm.deepdive.farkle.model.entity.Game;
import edu.cnm.deepdive.farkle.model.entity.State;
import org.springframework.stereotype.Service;

@Service
public class GameService implements AbstractGameService {

  private final GameRepository gameRepository;

  public GameService(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  @Override
  public Game startOrJoin() {
    return GameRepository
        // Do we need to do .findByUserProfile?
  }

  @Override
  public Game getGame() {
    return null;
  }

  @Override
  public Game setGame(Game game) {
    return null;
  }

  @Override
  public Game getGameState() {
    return null;
  }

  @Override
  public Game setGameState(State state) {
    return null;
  }

  @Override
  public Game getCurrentPlayer() {
    return null;
  }
}
