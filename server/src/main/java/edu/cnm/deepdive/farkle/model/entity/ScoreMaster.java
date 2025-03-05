package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "score_master")
public class ScoreMaster {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "scoreid")
  private Long scoreId;

  @ElementCollection
  @CollectionTable(name = "score_values", joinColumns = @JoinColumn(name = "score_id"))
  @Column(name = "value")
  private List<Integer> values = new ArrayList<>();

  @Column(name = "bankscore") // Removed nullable as JPA defaults to nullable
  private Integer bankScore;

  // Getters and Setters (same as before)
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