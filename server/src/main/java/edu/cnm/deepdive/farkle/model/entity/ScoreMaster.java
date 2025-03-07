package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class ScoreMaster {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "score_id", nullable = false)
  private Long Id;

  // Bank score
  @Column(nullable = true)
  private Integer bankScore;

  // List of dice values
  @ElementCollection
  private List<Integer> diceValues;
  // TODO: 3/7/25 check with nick about list field 

  //Getters & Setters
  public Long getId() {
    return Id;
  }

  public Integer getBankScore() {
    return bankScore;
  }

  public void setBankScore(Integer bankScore) {
    this.bankScore = bankScore;
  }

  public List<Integer> getDiceValues() {
    return diceValues;
  }

  public void setDiceValues(List<Integer> diceValues) {
    this.diceValues = diceValues;
  }


}
