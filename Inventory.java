import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to inventory.");
    }

    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getName());
        }
    }

    // Uses (and removes) an item by its position in the list
    public Item useItem(int index) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Invalid item selection.");
            return null;
        }
        Item used = items.get(index);
        items.remove(index);
        return used;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}