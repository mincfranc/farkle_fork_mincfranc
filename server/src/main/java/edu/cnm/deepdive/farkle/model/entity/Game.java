package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Game {

  @OneToMany(mappedBy = "game", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
  private final List<Turn> turns = new LinkedList<>();
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "game_id", nullable = false)
  private Long Id;
  @ManyToOne
  @JoinColumn(nullable = false) //foreign key 1
  private User currentPlayer;
  @ManyToOne
  @JoinColumn(nullable = true)//foreign key 2
  private Turn currentTurn;
  @ManyToOne
  @JoinColumn(nullable = true)//foreign key 4
  private User winner;
  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private State state;

  // Getters and Setters
  public Long getId() {
    return Id;
  }

  public User getCurrentPlayer() {
    return currentPlayer;
  }

  public void setCurrentPlayer(User currentPlayer) {
    this.currentPlayer = currentPlayer;
  }

  public Turn getCurrentTurn() {
    return currentTurn;
  }

  public void setCurrentTurn(Turn currentTurn) {
    this.currentTurn = currentTurn;
  }

  public User getWinner() {
    return winner;
  }

  public void setWinner(User winner) {
    this.winner = winner;
  }

  public State getState() {
    return state;
  }

  public void setState(State gameStatus) {
    this.state = gameStatus;
  }

  // TODO: 3/7/25 Correct players field & add getter/setter
  // @ManyToMany
//  private List<UserProfile> players;


}




