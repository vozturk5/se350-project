public class CardPayment implements PaymentStrategy {
    private String cardLastFour;

    public CardPayment(String cardLastFour) {
        this.cardLastFour = cardLastFour;
    }

    public boolean pay(double amount) {
        System.out.printf("Payment successful: $%.2f paid using Card ending in %s.%n", amount, cardLastFour);
        return true;
    }
}