package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Game {

  @Id
  @GeneratedValue
  @Column(name = "game_id", nullable = false)
  private Long Id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "current_player", nullable = false)
  private UserProfile currentPlayer;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "turn_id", nullable = true)
  private Turn currentTurn;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "winner_id", nullable = true, insertable = false, updatable = false)
  private UserProfile winner;

  @Enumerated(EnumType.STRING)
  private State state;

  @OneToMany(mappedBy = "game", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
  private final List<Turn> turns = new LinkedList<>();

  public Long getId() {
    return Id;
  }

  public UserProfile getCurrentPlayer() {
    return currentPlayer;
  }

  public Turn getCurrentTurn() {
    return currentTurn;
  }

  public void setCurrentTurn(Turn currentTurn) {
    this.currentTurn = currentTurn;
  }

  public UserProfile getWinner() {
    return winner;
  }

  public void setWinner(UserProfile winner) {
    this.winner = winner;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

}




