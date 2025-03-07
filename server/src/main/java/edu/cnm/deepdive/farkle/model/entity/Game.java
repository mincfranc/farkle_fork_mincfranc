package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "game")
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long gameId;

  @ManyToOne
  @JoinColumn(name = "current_player", optional = true) //foreign key 1
  private User currentPlayer;

  @ManyToOne
  @JoinColumn(name = "current_turn", nullable = true)//foreign key 2
  private Turn currentTurn;

  @ManyToOne
  @JoinColumn(name = "winner", nullable = true)//foreign key 3
  private User winner;

  @ManyToOne
  @JoinColumn(name = "game_state", nullable = false)//foreign key 4
  private State state;

  // Constructor
  public Game() {}

  // Getters and Setters
  public Long getGameId() { return gameId; }

  public User getCurrentPlayer() { return currentPlayer; }
  public void setCurrentPlayer(User currentPlayer) { this.currentPlayer = currentPlayer; }

  public Turn getCurrentTurn() { return currentTurn; }
  public void setCurrentTurn(Turn currentTurn) { this.currentTurn = currentTurn; }

  public User getWinner() { return winner; }
  public void setWinner(User winner) { this.winner = winner; }

  public GameStatus getGameStatus() { return gameStatus; }
  public void setGameStatus(GameStatus gameStatus) { this.gameStatus = gameStatus; }
}




