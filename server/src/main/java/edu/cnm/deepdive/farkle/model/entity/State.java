package edu.cnm.deepdive.farkle.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "game_status")
public class State {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "stateid")
  private Long stateId;

  @Column(name = "sequence", nullable = false)
  private Integer sequence;

  @Column(name = "description", nullable = false)
  private String description;

  //Getters & Setters
  public Long getStateId() {return stateId;}

  public Integer getSequence() {return sequence;}

  public void setSequence(Integer sequence) {this.sequence = sequence;}

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
