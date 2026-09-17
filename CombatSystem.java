import java.util.Scanner;

public class CombatSystem {
    private Scanner scanner = new Scanner(System.in);

    public void startBattle(Player player, Monster monster, Inventory inventory) {
    System.out.println("A wild " + monster.getName() + " appears!");

    while (player.isAlive() && monster.isAlive()) {
        player.showStats();
        monster.showStats();

        System.out.println("1. Attack");
        System.out.println("2. Use Item");
        System.out.print("Choose action: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            monster.takeDamage(player.getAttackPower());
            System.out.println("You hit " + monster.getName() + " for " + player.getAttackPower() + " damage!");
        } else if (choice.equals("2")) {
            inventory.showItems();
            if (!inventory.isEmpty()) {
                System.out.print("Choose item number: ");
                int idx = Integer.parseInt(scanner.nextLine()) - 1;
                Item used = inventory.useItem(idx);
                if (used != null && used.getType().equals("potion")) {
                    player.heal(used.getValue());
                }
            }
        } else {
            System.out.println("Invalid choice, try again.");
        }

        if (monster.isAlive()) {
            player.takeDamage(monster.getAttackPower());
            System.out.println(monster.getName() + " hits you for " + monster.getAttackPower() + " damage!");
        }
    }

    if (player.isAlive()) {
        System.out.println("You defeated " + monster.getName() + "!");
    } else {
        System.out.println("You were defeated...");
    }
}
}