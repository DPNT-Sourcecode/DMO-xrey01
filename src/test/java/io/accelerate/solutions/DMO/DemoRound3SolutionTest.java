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
    void whenItemsHaveSameNameButSkuIsDifferentThenReturnSizeAsTwo() {
        InventoryItem item = new InventoryItem("SKU001", "Gadget", 2500);
        InventoryItem item2 = new InventoryItem("SKU002", "Gadget", 2500);

        round3Solution.inventoryAdd(item, 10);
        round3Solution.inventoryAdd(item2, 9);

        assertThat(round3Solution.inventorySize(), equalTo(2));
    }

    @Test
    void whenItemsAreAddedWithSameSkuThenReturnSizeAsOne() {
        InventoryItem item = new InventoryItem("SKU001", "Gadget", 2500);
        InventoryItem item2 = new InventoryItem("SKU001", "Gadget", 2500);

        round3Solution.inventoryAdd(item, 10);
        round3Solution.inventoryAdd(item2, 1);

        assertThat(round3Solution.inventorySize(), equalTo(1));
    }

    @Test
    void whenGetExistingItemThenReturnFullDetails() {
        InventoryItem item = new InventoryItem("SKU123", "Premium Widget", 5000);
        round3Solution.inventoryAdd(item, 20);

        InventoryItem result = round3Solution.inventoryGet("SKU123");

        assertThat(result, notNullValue());
        assertThat(result.sku(), equalTo("SKU123"));
        assertThat(result.name(), equalTo("Premium Widget"));
        assertThat(result.price(), equalTo(5000));
    }

    @Test
    void whenGetMissingItemThenReturnNull() {
        InventoryItem result = round3Solution.inventoryGet("NONEXISTENT");
        assertThat(result, nullValue());
    }
}



