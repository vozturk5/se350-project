public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder addItem(MenuItem item) {
        order.addItem(item);
        return this;
    }

    public OrderBuilder addItem(MenuItem item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            order.addItem(item);
        }
        return this;
    }

    public Order build() {
        return order;
    }
}