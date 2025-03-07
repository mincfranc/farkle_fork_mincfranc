package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
public class Turn {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // Primary key auto-generated
  @Column(name = "turn_id")  // Column name as per ERD
  private Long turnId;

  @Column(nullable = false)
  private Integer turnScore;

  @Column(nullable = false)
  private Boolean finished;

  @ManyToOne (optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "game_id", nullable = false, updatable = false)
  private Game game;

  //Constructor

  // Getters and Setters
  private Long getTurnId() {
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

  // TODO: 3/7/25  correct rolls field & getter/setter
//  @OneToMany
//  private List<Roll> rolls;


}
