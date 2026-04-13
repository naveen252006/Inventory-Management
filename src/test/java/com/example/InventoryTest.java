package src.test.java.com.example;

import src.main.java.com.example.Inventory;

public class InventoryTest {

    @Test
    void testAddStock() {
        Inventory inv = new Inventory(10);
        inv.addStock(5);
        assertEquals(15, inv.getStock());
    }


    // @Test
    // void testRemoveStock() {
    //     Inventory inv = new Inventory(10);
    //     inv.removeStock(4);
    //     assertEquals(6, inv.getStock());
    // }

    private void assertEquals(int i, int stock) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    private void assertThrows(Class<IllegalArgumentException> class1, Runnable runnable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testRemoveStockInvalid() {
        Inventory inv = new Inventory(10);
        assertThrows(IllegalArgumentException.class, () -> {
            inv.removeStock(20);
        });
    }
}