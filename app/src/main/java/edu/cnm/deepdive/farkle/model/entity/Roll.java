package edu.cnm.deepdive.farkle.model.entity;

import androidx.room.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roll")  // Matches table name from ERD
public class Roll {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // Primary key auto-generated
  @Column(name = "rollid")  // Column name as per ERD
  private Long rollId;

  @Column(name = "numberdice", nullable = true)  // Column is nullable, matches ERD
  private Integer numberDice;

  @ElementCollection  // ElementCollection for storing simple collection of integers (dice values)
  @CollectionTable(name = "roll_dice_values", joinColumns = @JoinColumn(name = "roll_id"))
  @Column(name = "dice_value")
  private List<Integer> diceValues = new ArrayList<>();  // Initialize with an empty list

  @ElementCollection  // ElementCollection for storing simple collection of integers (score values)
  @CollectionTable(name = "roll_score_values", joinColumns = @JoinColumn(name = "roll_id"))
  @Column(name = "score_value")
  private List<Integer> scoreValues = new ArrayList<>();  // Initialize with an empty list

  @Column(name = "farkle", nullable = true)  // Column is nullable, matches ERD
  private Boolean farkle;

  // Getters and Setters
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
