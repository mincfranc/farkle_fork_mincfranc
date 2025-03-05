package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "userid")
  private Long userId;

  @Column(name = "oauthcode") // Removed nullable as JPA defaults to nullable
  private String oauthCode;

  @Column(name = "gamename") // Removed nullable as JPA defaults to nullable
  private String gameName;

  // Getters and Setters (same as before)
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }
  public String getOauthCode() {
    return oauthCode;
  }
  public void setOauthCode(String oauthCode) {
    this.oauthCode = oauthCode;
  }
  public String getGameName() {
    return gameName;
  }
  public void setGameName(String gameName) {
    this.gameName = gameName;
  }
}