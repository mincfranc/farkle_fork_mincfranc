---
title: Overview
subtitle: "Summary of project, intended users/stories; persistent data; external services."
order: 0
---

[//]: # (TODO Copy and update content from proposal to the sections below.)

## Overview

### 🎲 Farkle: The Ultimate Turn-Based Dice Game App

Imagine a fast-paced, competitive dice game you can play anytime, anywhere. This Farkle app brings
the classic risk-and-reward gameplay to your phone, featuring asynchronous play so you can take 
turns at your convenience. Use round time limits to keep the game engaging, without dragging on.


**Farkle** — This game will use the main ruleset and scoring of Farkle and implement asynchronous
play through a web service (with time limits to keep games moving).

### Example Session

**Startup**

Login: Choose a display name on first play, with option to change later

Start a game session

Watch other players' turns on screen while waiting for your turn

Take your turn: Roll dice, select scoring combinations, bank points (or Farkle)

Continue rounds until someone reaches the winning score

View post-game summary showing winner and point rankings

Settings screen
- Select score goal (10,000, 15,000, etc.) (game)
- Day/night theme (user)

Help screen with Farkle rules and scoring guide

### Gameplay challenges/fun

- Random number generation for dice rolls
- Dynamic removal of scoring dice between rolls 
- subsequent rolls would have - the number of dice "frozen or scored", end of round would need 
scoring and bust condition.

[Add Stretch goals page](#)

### Webservice

This game has a service to keep track of a game in progress, take users scores and pass the round 
to the next player after the previous player completes.


## Intended users and user stories

### User Stories

#### People who enjoy classic games

As someone who enjoys classic games, I would like to use the Farkle app to play a game of Farkle

#### People who want to play with others and see their game data

As a new player, I want to create a display name upon first login so that I can be identified in multiplayer games.
As a returning player, I want to log in with my existing credentials so that I can continue playing with my saved settings.
As a player, I want to see my stats and performance history so that I can track my improvements over time.

## Persistent data

User account/login - to save data
History of gameplay
Game state

## External services and data sources

Google account