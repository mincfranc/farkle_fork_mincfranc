package edu.cnm.deepdive.farkle.model.entity;

import androidx.room.Entity;
@Entity
@Table(name = "game")  // Matches table name from ERD
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // Primary key auto-generated
  @Column(name = "gameid")  // Column name as per ERD
  private Long gameId;

  @ManyToMany  // Many-to-many relationship with User (Players)
  @JoinTable(
      name = "game_user",
      joinColumns = @JoinColumn(name = "game_id"),  // Join column for this entity
      inverseJoinColumns = @JoinColumn(name = "user_id"))  // Join column for the related entity
  private List<User> players = new ArrayList<>();  // Initialize collection with an empty list

  @ManyToOne  // Many-to-one relationship with User (Current Player)
  @JoinColumn(name = "current_player_id")  // Foreign key for current player
  private User currentPlayer;

  @ManyToOne  // Many-to-one relationship with GameState
  @JoinColumn(name = "state_id")  // Foreign key for game state
  private GameState gameState;

  @Column(name = "turn_id", nullable = true)  // Column is nullable, matches ERD
  private Long turnId;

  @ManyToOne  // Many-to-one relationship with User (Winner)
  @JoinColumn(name = "winner_id", nullable = true)  // Foreign key for winner
  private User winner;

  // Getters and Setters
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
