package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
public class GamePlayer {

  // TODO: 4/2/25 Add a creation timestamp.

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

  // TODO: 4/2/25 Complete definition of this entity class.

}
