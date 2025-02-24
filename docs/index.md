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

- User Accounts: User account data, including display names, login credentials and user preferences (e.g., theme selection, notification settings).
- Gameplay History: A record of all completed games, including game IDs, player IDs, scores, timestamps, and game outcomes (win/loss/draw).
- Game State: For each active game, store the current game state, including the current player's turn, dice values, scored points, and frozen/banked points.
- User Preferences: Individual user settings, such as preferred notification types (e.g., email, push notifications), sound effects volume, and game difficulty level.
- Leaderboard Data: Information required to display a leaderboard, including player IDs, usernames, and their corresponding scores or rankings.
- Invites and Friend Lists: Data related to social features, including sent and received game invites, friend lists, and associated player IDs.

**NOTE** not all of these features will make it into the first version of this game


## External services and data sources

**Google Identity Services**
- Service Name: Google Identity Services
- [Google identity services overview](https://developers.google.com/identity/gsi/web/guides/overview)
- Usage: Google Identity Services will be used for user authentication in the Farkle app. It allows users to log in with their Google accounts, ensuring a secure and convenient authentication process. By integrating this service, we can associate users with their desired game names and, in future releases, track score rankings, user preferences, communication methods, and preferred opponents.
- Impact of Interruption: If Google Identity Services is unavailable, users will not be able to log in to the Farkle application, rendering the app inaccessible for gameplay.

**Digital Ocean Droplets**
- Service Name: Digital Ocean Droplets
- [Digital Ocean Droplets Product Page](https://www.digitalocean.com/products/droplets)
- Usage: Digital Ocean Droplets will be utilized as the backend infrastructure for the Farkle application. It will host the database and web server, managing the business logic and web services required for the app's functionality. Droplets provide a scalable and reliable environment for running the application's backend.
- Impact of Interruption: If Digital Ocean Droplets are unavailable, the Farkle application will not function, as the backend services and database will be inaccessible, preventing users from playing the game.
