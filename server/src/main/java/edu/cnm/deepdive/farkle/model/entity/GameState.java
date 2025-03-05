package edu.cnm.deepdive.farkle.model.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "game_state")
public class GameState {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "stateid")
  private Long stateId;
  @Column(name = "sequence") // Removed nullable as JPA defaults to nullable
  private Integer sequence;
  @Column(name = "description") // Removed nullable as JPA defaults to nullable
  private String description;
  // Getters and Setters (same as before)
  public Long getStateId() {
    return stateId;
  }
  public void setStateId(Long stateId) {
    this.stateId = stateId;
  }
  public Integer getSequence() {
    return sequence;
  }
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
}