package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "game")
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "game_id", nullable = false)
  private Long gameId;


  @ManyToOne
  @JoinColumn(name = "current_player", nullable = false) //foreign key 1
  private User currentPlayer;

  @ManyToOne
  @JoinColumn(name = "current_turn", nullable = true)//foreign key 2
  private Turn currentTurn;

  @ManyToOne
  @JoinColumn(name = "winner", nullable = true)//foreign key 4
  private User winner;

  @ManyToOne
  @JoinColumn(name = "game_state", nullable = false)//foreign key 3
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

  public State getGameState() { return gameState; }
  public void setGameState(State gameStatus) { this.gameState = gameStatus; }

  // TODO: 3/7/25 Correct players field & add getter/setter
  // @ManyToMany
//  private List<UserProfile> players;


}




