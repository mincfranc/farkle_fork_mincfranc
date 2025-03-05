package edu.cnm.deepdive.farkle.model.entity;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "game")
public class Game {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "gameid")
  private Long gameId;
  @ManyToMany
  @JoinTable(
      name = "game_user",
      joinColumns = @JoinColumn(name = "game_id"),
      inverseJoinColumns = @JoinColumn(name = "user_id"))
  private List<User> players = new ArrayList<>();
  @ManyToOne
  @JoinColumn(name = "current_player_id")
  private User currentPlayer;
  @ManyToOne
  @JoinColumn(name = "state_id")
  private GameState gameState;
  @Column(name = "turn_id") // Removed nullable as JPA defaults to nullable
  private Long turnId;
  @ManyToOne
  @JoinColumn(name = "winner_id")
  private User winner;
  // Getters and Setters (same as before)
  public Long getGameId() {
    return gameId;
  }
  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }
  public List<User> getPlayers() {
    return players;
  }
  public void setPlayers(List<User> players) {
    this.players = players;
  }
  public User getCurrentPlayer() {
    return currentPlayer;
  }
  public void setCurrentPlayer(User currentPlayer) {
    this.currentPlayer = currentPlayer;
  }
  public GameState getGameState() {
    return gameState;
  }
  public void setGameState(GameState gameState) {
    this.gameState = gameState;
  }
  public Long getTurnId() {
    return turnId;
  }
  public void setTurnId(Long turnId) {
    this.turnId = turnId;
  }
  public User getWinner() {
    return winner;
  }
  public void setWinner(User winner) {
    this.winner = winner;
  }
}