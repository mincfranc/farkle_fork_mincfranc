package edu.cnm.deepdive.farkle.model.dto;

import com.google.gson.annotations.Expose;
import java.util.List;
import java.util.UUID;

public class Game {

  @Expose(serialize = false)
  private UUID key;

  @Expose(serialize = false)
  private State state;

  @Expose(serialize = false)
  private List<GamePlayer> players;

  @Expose(serialize = false)
  private User winner;

  @Expose(serialize = false)
  private Turn currentTurn;

  /*"key": "bbcc8f4e-b673-45d4-9b1a-5e9c9e9c3f7d",
      "state": "PRE_GAME",
      "players": [
  {
    "timestamp": "2025-04-03T21:58:45.422131Z",
      "user": {
    "key": "66fbab8e-f3d4-49a6-ba2a-974fb25e44bc",
        "displayName": "Mine"
  }
  }
  ],
      "rollCount": 0*/

  //main structure of the game object to be received from server

}
