package edu.cnm.deepdive.farkle.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "userid")
  private Long userId;

  @Column(nullable = false, updatable = false, unique = true)
  @JsonProperty(value = "key", access = JsonProperty.Access.READ_ONLY)
  private UUID externalKey;

  @Column(name = "oauthcode", nullable = false, unique = true) //JPA defaults to nullable
  private String oauthCode;

  @Column(name = "gamename", nullable = false, unique = true)
  private String gameName;

  // Getters & Setters
  //"userId" Needs a getter for retrieval of data
  //"userId" does not need setters. It is an immutable field & a primary key, set once and should not be modified.
  public Long getUserId() {return userId;}

  //fields oauthcode & gamename need getters and setters
  //they are nullable fields and are expected to change with every user

  public String getOauthCode() {return oauthCode;}

  public void setOauthCode(String oauthCode) {this.oauthCode = oauthCode;}


  public String getGameName() {return gameName;}

  public void setGameName(String gameName) {this.gameName = gameName;}
  
}