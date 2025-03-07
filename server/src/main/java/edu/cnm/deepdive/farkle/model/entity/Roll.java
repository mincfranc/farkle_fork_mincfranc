package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Roll {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "roll_id")
  private Long Id;

  @Column(nullable = true)
  private Integer rollScore;

  @Column(nullable = true)
  private Boolean farkle;

  @ElementCollection
  private List<Integer> numberDice;

  @ElementCollection
  private List<Integer> diceValues;

  //Getters and Setters
  public Long getId() {
    return Id;
  }

  public Integer getRollScore() {
    return rollScore;
  }

  public void setRollScore(Integer rollScore) {
    this.rollScore = rollScore;
  }

  public Boolean getFarkle() {
    return farkle;
  }

  public void setFarkle(Boolean farkle) {
    this.farkle = farkle;
  }

  public List<Integer> getNumberDice() {
    return numberDice;
  }

  public void setNumberDice(List<Integer> numberDice) {
    this.numberDice = numberDice;
  }

  public List<Integer> getDiceValues() {
    return diceValues;
  }

  public void setDiceValues(List<Integer> diceValues) {
    this.diceValues = diceValues;
  }
}