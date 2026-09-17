public class Monster {
    private String name;
    private int health;
    private int attackPower;

    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showStats() {
        System.out.println(name + " | HP: " + health + " | ATK: " + attackPower);
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }
}