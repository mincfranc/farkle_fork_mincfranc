package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Turn {

  // Primary key field
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "turn_id")
  private Long Id;

  // Score for the turn
  @Column(nullable = false)
  private Integer turnScore;

  // Flag indicating if the turn is finished
  @Column(nullable = false)
  private Boolean finished;

  // Reference to game entity
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name = "game_id", nullable = false, updatable = false)
  private Game game;

  // Getters and Setters
  private Long getId() {
    return Id;
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


  public Game getGame() {
    return game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

  // TODO: 3/7/25  correct rolls field & getter/setter
//  @OneToMany
//  private List<Roll> rolls;


}
