package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roll")
public class Roll {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "rollid")
  private Long rollId;

  @Column(name = "numberdice") // Removed nullable as JPA defaults to nullable
  private Integer numberDice;

  @ElementCollection
  @CollectionTable(name = "roll_dice_values", joinColumns = @JoinColumn(name = "roll_id"))
  @Column(name = "dice_value")
  private List<Integer> diceValues = new ArrayList<>();

  @ElementCollection
  @CollectionTable(name = "roll_score_values", joinColumns = @JoinColumn(name = "roll_id"))
  @Column(name = "score_value")
  private List<Integer> scoreValues = new ArrayList<>();

  @Column(name = "farkle") // Removed nullable as JPA defaults to nullable
  private Boolean farkle;

  // Getters and Setters (same as before)
  public Long getRollId() {
    return rollId;
  }
  public void setRollId(Long rollId) {
    this.rollId = rollId;
  }
  public Integer getNumberDice() {
    return numberDice;
  }
  public void setNumberDice(Integer numberDice) {
    this.numberDice = numberDice;
  }
  public List<Integer> getDiceValues() {
    return diceValues;
  }
  public void setDiceValues(List<Integer> diceValues) {
    this.diceValues = diceValues;
  }
  public List<Integer> getScoreValues() {
    return scoreValues;
  }
  public void setScoreValues(List<Integer> scoreValues) {
    this.scoreValues = scoreValues;
  }
  public Boolean getFarkle() {
    return farkle;
  }
  public void setFarkle(Boolean farkle) {
    this.farkle = farkle;
  }
}