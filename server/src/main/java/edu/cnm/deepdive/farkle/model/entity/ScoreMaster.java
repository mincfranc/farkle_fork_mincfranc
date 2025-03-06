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

  @Column(name = "bankscore", nullable = true)
  private Integer bankScore;

  //Getters & Setters
  public Long getScoreId() {return scoreId;}

  public Integer getBankScore() {
    return bankScore;
  }

  public void setBankScore(Integer bankScore) {
    this.bankScore = bankScore;
  }

}
