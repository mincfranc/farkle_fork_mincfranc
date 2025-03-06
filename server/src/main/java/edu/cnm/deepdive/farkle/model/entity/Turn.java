package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "turn")  // Matches table name from ERD
public class Turn {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // Primary key auto-generated
  @Column(name = "turn_id")  // Column name as per ERD
  private Long turnId;

  @Column(name = "turn_score", nullable = false)
  private Integer turnScore;

  @Column(name = "finished", nullable = false)
  private Boolean finished;

  @ManyToOne (optional = false)
  private Game game;

  //Constructor

  // Getters and Setters
  public Long getTurnId() {
    return turnId;
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


  public Game getGame() {return game;}

  public void setGame(Game game) {this.game = game;}

}
