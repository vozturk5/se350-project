public class CashPayment implements PaymentStrategy {
    public boolean pay(double amount) {
        System.out.printf("Payment successful: $%.2f paid using Cash.%n", amount);
        return true;
    }
}