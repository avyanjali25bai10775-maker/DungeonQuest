import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Dungeon Quest!");
        Scanner scanner = new Scanner(System.in);
        SaveManager saveManager = new SaveManager();

        System.out.println("1. New Game");
        System.out.println("2. Load Game");
        System.out.print("Choose: ");
        String choice = scanner.nextLine();

        Player hero;
        if (choice.equals("2")) {
            hero = saveManager.loadGame();
            if (hero == null) {
                hero = new Player("Aria");
            }
        } else {
            System.out.print("Enter your character's name: ");
            String playerName = scanner.nextLine();
            hero = new Player(playerName);
        }

        Inventory inventory = new Inventory();
        CombatSystem combat = new CombatSystem();

        Room[] dungeon = {
            new Room("A damp entrance hall.", new Monster("Goblin", 40, 8), null),
            new Room("A quiet storage room.", null, new Item("Health Potion", "potion", 20)),
            new Room("A dark chamber with a growl echoing.", new Monster("Orc", 60, 12), null)
        };

        for (Room room : dungeon) {
            if (!hero.isAlive()) break;

            System.out.println("\n" + room.getDescription());

            if (room.hasItem()) {
                Item found = room.takeItem();
                System.out.println("You found: " + found.getName());
                inventory.addItem(found);
            }

            if (room.hasMonster()) {
                combat.startBattle(hero, room.getMonster(), inventory);
            }
        }

        if (hero.isAlive()) {
            System.out.println("\nYou survived the dungeon!");
        } else {
            System.out.println("\nYour journey ends here...");
        }

        saveManager.saveGame(hero);
        scanner.close();
    }
}