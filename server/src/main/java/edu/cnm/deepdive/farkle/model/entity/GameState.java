package edu.cnm.deepdive.farkle.model.entity;

import androidx.room.Entity;

@Entity
@Table(name = "game_state")  // Matches table name from ERD
public class GameState {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // Primary key auto-generated
  @Column(name = "stateid")  // Column name as per ERD
  private Long stateId;

  @Column(name = "sequence", nullable = true)  // Column is nullable, matches ERD
  private Integer sequence;

  @Column(name = "description", nullable = true)  // Column is nullable, matches ERD
  private String description;

  // Getters and Setters
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
