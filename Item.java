public class Item {
    private String name;
    private String type;   // e.g. "potion", "weapon"
    private int value;     // how much it heals, or attack bonus, etc.

    public Item(String name, String type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}