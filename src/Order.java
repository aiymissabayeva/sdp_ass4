public class Order {
    private int id;
    private String product;
    private int quantity;
    private double price;
    private String status;

    public Order(int id, double price, String product, int quantity) {
        this.id = id;
        this.price = price;
        this.product = product;
        this.quantity = quantity;
        this.status = "NEW";
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
