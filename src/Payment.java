public class Payment {
    public boolean processPayment(double amount, boolean approved){
        if (amount <= 0){
            System.out.println("Invalid payment amount.");
            return false;
        }
        if (approved) {
            System.out.println("Payment successful: " + amount);
            return true;
        }
        System.out.println("Payment failed.");
        return false;
    }

    public void refundPayment(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Invalid refund amount");
        }
        System.out.println("Payment refunded: " + amount);
    }
}
