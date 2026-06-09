public interface OrderState {
    String getStatusName();

    boolean canModifyOrder();

    void pay(Order order);

    void prepare(Order order);

    void markReady(Order order);

    void complete(Order order);

    void cancel(Order order);
}