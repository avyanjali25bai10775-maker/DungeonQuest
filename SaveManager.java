import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SaveManager {
    private static final String SAVE_FILE = "savegame.txt";

    public void saveGame(Player player) {
        try (FileWriter writer = new FileWriter(SAVE_FILE)) {
            writer.write(player.getName() + "\n");
            writer.write(player.getHealth() + "\n");
            writer.write(player.getAttackPower() + "\n");
            System.out.println("Game saved!");
        } catch (IOException e) {
            System.out.println("Error saving game: " + e.getMessage());
        }
    }

    public Player loadGame() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SAVE_FILE))) {
            String name = reader.readLine();
            int health = Integer.parseInt(reader.readLine());
            int attackPower = Integer.parseInt(reader.readLine());

            Player player = new Player(name);
            player.setAttackPower(attackPower);
            int damageTaken = player.getHealth() - health;
            player.takeDamage(damageTaken);

            System.out.println("Game loaded! Welcome back, " + name + ".");
            return player;
        } catch (IOException e) {
            System.out.println("No save file found. Starting new game.");
            return null;
        }
    }
}