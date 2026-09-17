# Dungeon Quest

A text-based dungeon-crawler RPG built in Java, featuring turn-based combat, an inventory system, and save/load functionality via file I/O.

## Features
- Character system with health, level, and attack stats
- Turn-based combat against monsters
- Inventory system for collecting and using items (e.g., health potions) mid-battle
- Save/load game progress to a local file
- Multi-room dungeon exploration

## Tech Stack
- Java 17+ (no external libraries — uses only the standard library)

## Project Structure
DungeonQuest/
├── Main.java # Entry point, dungeon loop, save/load menu
├── Player.java # Player character class
├── Monster.java # Enemy class
├── Item.java # Item class (potions, etc.)
├── Inventory.java # Manages the player's items
├── CombatSystem.java # Turn-based combat logic
├── Room.java # Represents a single dungeon room
├── SaveManager.java # Handles saving/loading via file I/O
└── README.md


### How to Play
- On launch, choose **New Game** or **Load Game**
- Enter your character's name (New Game only)
- Move through dungeon rooms — pick up items automatically, fight monsters that appear
- During combat, choose to **Attack** or **Use Item**
- Progress is automatically saved after the dungeon run ends

## Save Files
Game progress is saved to `savegame.txt` in the project directory. This file is created automatically on first save.

## Author
Avyanjali Kumar 
Reg no. - 25BAI10775
