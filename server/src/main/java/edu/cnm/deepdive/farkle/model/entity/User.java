package edu.cnm.deepdive.farkle.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user_profile")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_profile_id", nullable = false)
  private Long Id;

  @Column(nullable = false, updatable = false, unique = true)
  @JsonProperty(value = "key", access = JsonProperty.Access.READ_ONLY)
  private UUID externalKey;

  @Column(nullable = true)
  private String authKey;

  @Column(nullable = true)
  private String displayName;

  // Getters & Setters
  //"userId" Needs a getter for retrieval of data
  //"userId" does not need setters. It is an immutable field & a primary key, set once and should not be modified.
  public Long getId() {return Id;}

  //fields authcode & gamename need getters and setters
  //they are nullable fields and are expected to change with every user
  public String getAuthKey() {
    return authKey;
  }

  public UUID getExternalKey() {
    return externalKey;
  }

  public void setAuthKey(String authCode) {
    this.authKey = authCode;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String gameName) {
    this.displayName = gameName;
  }



  
}