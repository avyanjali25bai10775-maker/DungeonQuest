public class Room {
    private String description;
    private Monster monster;   // can be null if the room is empty
    private boolean hasItem;
    private Item roomItem;

    public Room(String description, Monster monster, Item roomItem) {
        this.description = description;
        this.monster = monster;
        this.roomItem = roomItem;
        this.hasItem = (roomItem != null);
    }

    public String getDescription() {
        return description;
    }

    public Monster getMonster() {
        return monster;
    }

    public boolean hasMonster() {
        return monster != null && monster.isAlive();
    }

    public boolean hasItem() {
        return hasItem;
    }

    public Item takeItem() {
        hasItem = false;
        return roomItem;
    }
}