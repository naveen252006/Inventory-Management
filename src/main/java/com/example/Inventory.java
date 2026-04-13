package src.main.java.com.example;

public class Inventory {

    private int stock;

    // Constructor
    public Inventory(int initialStock) {
        this.stock = initialStock;
    }

    // Add stock
    public void addStock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
        }
    }

    // Remove stock
    public void removeStock(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
        } else {
            throw new IllegalArgumentException("Invalid quantity");
        }
    }

    // Get stock
    public int getStock() {
        return stock;
    }
}