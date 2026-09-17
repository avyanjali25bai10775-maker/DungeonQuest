public class Player {
    // Fields (the player's data/state)
    private String name;
    private int health;
    private int maxHealth;
    private int level;
    private int attackPower;

    // Constructor - runs when you create a new Player
    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.maxHealth = 100;
        this.health = maxHealth;
        this.attackPower = 10;
    }

    // Reduces health when attacked
    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    // Checks if the player is still alive
    public boolean isAlive() {
        return health > 0;
    }

    // Displays current stats
    public void showStats() {
        System.out.println(name + " | Level " + level +
            " | HP: " + health + "/" + maxHealth +
            " | ATK: " + attackPower);
    }

    // Getter methods - other classes will need these
    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getHealth() {
        return health;
    }
    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
        System.out.println(name + " healed for " + amount + " HP!");
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
}
}