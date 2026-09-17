# Project Statement — Dungeon Quest

## Problem Statement
Many introductory programming exercises are either too abstract (isolated algorithm problems) or too shallow (single-file scripts) to demonstrate real object-oriented design. This project addresses that gap by building a small but complete interactive application — a text-based RPG — that requires multiple cooperating classes, state management, user input handling, and data persistence, all through the command line.

## Scope
Dungeon Quest is a single-player, terminal-based dungeon-crawler RPG. The player creates a character, moves through a sequence of dungeon rooms, fights monsters in turn-based combat, collects and uses items, and can save/resume progress between sessions.

**In scope:**
- Character creation and stat tracking
- Turn-based combat system
- Item collection and usage (inventory management)
- Multi-room dungeon progression
- Save/load via local file storage

**Out of scope (possible future work):**
- Graphical interface
- Branching/non-linear room navigation
- Multiplayer or networked play
- Persistent leveling/experience system across multiple runs

## Target Users
Anyone wanting a lightweight, dependency-free RPG playable directly from a terminal — primarily built here as a demonstration of core Java OOP principles (encapsulation, class collaboration, file I/O, collections) applied to an interactive system rather than an isolated script.

## Core Features
1. **Character System** — tracks name, health, level, and attack power
2. **Combat System** — turn-based battles with attack/item-use choices
3. **Inventory System** — collect and use items (e.g., health potions) via `ArrayList`
4. **Save/Load System** — persists player state to a file using Java file I/O
5. **Exploration System** — sequential dungeon rooms with monsters and item pickups

## Technology
Built entirely in core Java (JDK 17+), using only the standard library — no external frameworks or dependencies, keeping setup and execution simple for evaluation.