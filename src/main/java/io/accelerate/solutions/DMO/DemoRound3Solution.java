package io.accelerate.solutions.DMO;

import java.util.HashMap;
import java.util.Map;

public class DemoRound3Solution {
    private final Map<String, Integer> inventory = new HashMap<>();
    private final Map<String, InventoryItem> items = new HashMap<>();

    public int inventoryAdd(InventoryItem item, int quantity) {
        items.put(item.sku(), item);
        int currentQuantity = inventory.getOrDefault(item.sku(), 0);
        int newQuantity = currentQuantity + quantity;
        inventory.put(item.sku(), newQuantity);
        return newQuantity;
    }

    public int inventorySize() {
        return inventory.size();
    }

    public InventoryItem inventoryGet(String sku) {
        return items.get(sku);
    }
}






