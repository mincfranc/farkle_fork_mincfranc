package edu.cnm.deepdive.farkle.model.entity;

import androidx.room.Entity;

@Entity
@Table(name = "user")  // Matches table name from ERD
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // Primary key auto-generated
  @Column(name = "userid")  // Column name as per ERD
  private Long userId;

  @Column(name = "oauthcode", nullable = true)  // Column is nullable, matches ERD
  private String oauthCode;

  @Column(name = "gamename", nullable = true)  // Column is nullable, matches  ERD
  private String gameName;

  // Getters and Setters follow JavaBeans convention
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
