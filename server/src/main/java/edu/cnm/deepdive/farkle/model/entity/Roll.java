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

  @Column(name= "roll_score", nullable = true)
  private Integer rollScore;

  @Column(name = "farkle",  nullable = true)
  private Boolean farkle;

  //Getters and Setters
  public Long getRollId() {return rollId;}

  public Integer getRollScore() {return rollScore;}

  public void setRollScore(Integer rollScore) {this.rollScore = rollScore;}

  public Boolean getFarkle() {return farkle;}

  public void setFarkle(Boolean farkle) {this.farkle = farkle;}


}