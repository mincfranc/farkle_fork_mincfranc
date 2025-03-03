package edu.cnm.deepdive.farkle.model.entity;

import androidx.room.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "score_master")  // Matches table name from ERD
public class ScoreMaster {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // Primary key auto-generated
  @Column(name = "scoreid")  // Column name as per ERD
  private Long scoreId;

  @ElementCollection  // ElementCollection for storing simple collection of integers (score values)
  @CollectionTable(name = "score_values", joinColumns = @JoinColumn(name = "score_id"))
  @Column(name = "value")
  private List<Integer> values = new ArrayList<>();  // Initialize with an empty list

  @Column(name = "bankscore", nullable = true)  // Column is nullable, matches ERD
  private Integer bankScore;

  // Getters and Setters
  public Long getScoreId() {
    return scoreId;
  }

  public void setScoreId(Long scoreId) {
    this.scoreId = scoreId;
  }

  public List<Integer> getValues() {
    return values;
  }

  public void setValues(List<Integer> values) {
    this.values = values;
  }

  public Integer getBankScore() {
    return bankScore;
  }

  public void setBankScore(Integer bankScore) {
    this.bankScore = bankScore;
  }
}
