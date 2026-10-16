public class Inventory {
    private int stock;

    public Inventory (int initialStock){
        if (initialStock < 0){
            throw new IllegalArgumentException("Stock can't be negative");
        }
        this.stock = initialStock;
    }

    public boolean checkStock(int quantity){
        return quantity > 0 && stock >= quantity;
    }

    public boolean reserveStock(int quantity) {
        if (checkStock(quantity)) {
            stock -= quantity;
            System.out.println("Reserved " + quantity + " items.");
            return true;
        }

        System.out.println("Not enough stock.");
        return false;
    }

    public void releaseStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }

        stock += quantity;
        System.out.println("Released " + quantity + " items.");
    }

    public int getStock() {
        return stock;
    }
}
