package io.accelerate.solutions.DMO;

import io.accelerate.runner.SolutionNotImplementedException;
import java.util.HashMap;
import java.util.Map;

public class DemoRound3Solution {
    private final Map<String, InventoryItem> inventory = new HashMap<>();
    private final Map<String, Integer> quantities = new HashMap<>();

    public int inventoryAdd(InventoryItem item, int quantity) {
//        inventory.put(item.sku(), item);
        int currentQuantity = quantities.getOrDefault(item.sku(), 0);
        int newQuantity = currentQuantity + quantity;
        quantities.put(item.sku(), newQuantity);
        return newQuantity;
    }

    public int inventorySize() {
        throw new SolutionNotImplementedException();
    }

    public InventoryItem inventoryGet(String sku) {
        throw new SolutionNotImplementedException();
    }
}

