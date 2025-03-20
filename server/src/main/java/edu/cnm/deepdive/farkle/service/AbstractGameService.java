package edu.cnm.deepdive.farkle.service;

import edu.cnm.deepdive.farkle.model.entity.Game;
import edu.cnm.deepdive.farkle.model.entity.State;

public interface AbstractGameService {

  Game startOrJoin();

  Game getGame();

  Game setGame(Game game);

  Game getGameState();

  Game setGameState(State state);

  Game getCurrentPlayer();


}
