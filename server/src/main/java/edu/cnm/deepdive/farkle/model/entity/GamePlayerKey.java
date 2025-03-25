package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
class GamePlayerKey implements Serializable {

  @Column(name = "game_id")
  Long gameId;

  @Column(name = "user_profile_id")
  Long userProfileId;

  public Long getGameId() {
    return gameId;
  }

  public Long getUserProfileId() {
    return userProfileId;
  }

  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }

  public void setUserProfileId(Long userProfileId) {
    this.userProfileId = userProfileId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    GamePlayerKey that = (GamePlayerKey) obj;
    return Objects.equals(gameId, that.gameId) &&
        Objects.equals(userProfileId, that.userProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, userProfileId);
  }
}
