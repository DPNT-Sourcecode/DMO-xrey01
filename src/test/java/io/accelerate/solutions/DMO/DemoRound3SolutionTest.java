package io.accelerate.solutions.DMO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DemoRound3SolutionTest {
    private DemoRound3Solution round3Solution;

    @BeforeEach
    public void setUp() {
        round3Solution = new DemoRound3Solution();
    }

    @Test
    void whenAddingNewItemThenReturnQuantity() {
        InventoryItem item = new InventoryItem("SKU001", "Widget", 1000);
        int result = round3Solution.inventoryAdd(item, 5);
        assertThat(result, equalTo(5));
    }

    @Test
    void whenUpdatingExistingItemThenReturnTotalQuantity() {
        InventoryItem item = new InventoryItem("SKU002", "Gadget", 2500);

        int firstAdd = round3Solution.inventoryAdd(item, 10);
        assertThat(firstAdd, equalTo(10));

        int secondAdd = round3Solution.inventoryAdd(item, 5);
        assertThat(secondAdd, equalTo(15));
    }

    @Test
    void whenItemsHaveSameNameButSkuIsDifferent() {
        InventoryItem item = new InventoryItem("SKU001", "Gadget", 2500);
        InventoryItem item2 = new InventoryItem("SKU002", "Gadget", 2500);

        round3Solution.inventoryAdd(item, 10);
        round3Solution.inventoryAdd(item2, 9);

        assertThat(round3Solution.inventorySize(), equalTo(2));
    }
}

