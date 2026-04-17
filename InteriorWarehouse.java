import java.util.HashMap;
import java.util.Map;

public class InteriorWarehouse {
	private static InteriorWarehouse instance;
    private Map<String, Integer> inventory = new HashMap<>();

    private InteriorWarehouse() {
        inventory.put("Couch", 10);
        inventory.put("TV Stand", 5);
        inventory.put("Plant", 20);
    }

    public static synchronized InteriorWarehouse getInstance() {
        if (instance == null) {
            instance = new InteriorWarehouse();
        }
        return instance;
    }

    // Synchronized to handle multiple threads building rooms at once
    public synchronized boolean requestItem(String item, int quantity) {
        if (inventory.getOrDefault(item, 0) >= quantity) {
            inventory.put(item, inventory.get(item) - quantity);
            return true;
        }
        return false;
    }
}
