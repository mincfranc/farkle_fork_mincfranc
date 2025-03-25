package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

public class GamePlayer {

  @EmbeddedId
  GamePlayerKey id;

  @ManyToOne
  @MapsId("gameId")
  @JoinColumn(name = "game_id")
  Game game;

  @ManyToOne
  @MapsId("userProfileId")
  @JoinColumn(name = "user_profile_id")
  User user;


}
