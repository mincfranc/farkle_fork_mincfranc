package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.*;

@Entity
@Table()
public class ScoreMaster {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "score_id")
  private Long Id;

  @Column(nullable = true)
  private Integer bankScore;

  //Getters & Setters
  public Long getId() {return Id;}

  public Integer getBankScore() {
    return bankScore;
  }

  public void setBankScore(Integer bankScore) {
    this.bankScore = bankScore;
  }

}
