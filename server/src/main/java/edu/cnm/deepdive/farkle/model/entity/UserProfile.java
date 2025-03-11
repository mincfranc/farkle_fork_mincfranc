package edu.cnm.deepdive.farkle.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "user_profile")
public class UserProfile {

  @Id
  @GeneratedValue
  @JsonProperty(value = "key", access = JsonProperty.Access.READ_ONLY)
  @Column(name = "user_profile_id", nullable = false)
  private Long Id;


  @Column(nullable = false, updatable = false, unique = true)
  @JsonProperty(value = "key", access = JsonProperty.Access.READ_ONLY)
  private UUID externalKey;

  @Column(nullable = true)
  private String authKey;

  @Column(nullable = true)
  private String displayName;

  public Long getId() {
    return Id;
  }

  public UUID getExternalKey() {
    return externalKey;
  }

  public String getAuthKey() {
    return authKey;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String gameName) {

    this.displayName = gameName;
  }

  @PrePersist
  void generateFieldValues() {
    externalKey = UUID.randomUUID();
  }


}