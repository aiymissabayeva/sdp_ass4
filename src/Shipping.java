import java.util.HashSet;
import java.util.Set;

public class Shipping {
    private Set<Integer> shipments = new HashSet<>();

    public boolean createShipment(int orderId){
        if (orderId <= 0){
            throw new IllegalArgumentException("Invalid order ID");
        }
        if (shipments.add(orderId)){
            System.out.println("Shipment created for order #" + orderId);
            return true;
        }
        System.out.println("Shipment already exists.");
        return false;
    }

    public boolean cancelShipment(int orderId){
        if (shipments.remove(orderId)){
            System.out.println("Shipment cancelled for order #" + orderId);
        }
        System.out.println("Shipment not found.");
        return false;
    }
}
