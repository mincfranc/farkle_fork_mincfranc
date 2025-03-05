package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "turn")  // Matches table name from ERD
public class Turn {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // Primary key auto-generated
  @Column(name = "turnid")  // Column name as per ERD
  private Long turnId;

  @OneToMany(mappedBy = "turn")  // One-to-many relationship with Roll (each turn has multiple rolls)
  private List<Roll> rolls = new ArrayList<>();  // Initialize collection with an empty list

  @Column(name = "turnscore", nullable = true)  // Column is nullable, matches ERD
  private Integer turnScore;

  @Column(name = "finished", nullable = true)  // Column is nullable, matches ERD
  private Boolean finished;

  // Getters and Setters
  public Long getTurnId() {
    return turnId;
  }

  public void setTurnId(Long turnId) {
    this.turnId = turnId;
  }

  public List<Roll> getRolls() {
    return rolls;
  }

  public void setRolls(List<Roll> rolls) {
    this.rolls = rolls;
  }

  public Integer getTurnScore() {
    return turnScore;
  }

  public void setTurnScore(Integer turnScore) {
    this.turnScore = turnScore;
  }

  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }
}
