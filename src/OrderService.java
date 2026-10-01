public class OrderService {

    private final DiscountPolicy discountPolicy;

    public OrderService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public Order createOrder(Member member, Product product, int quantity) {
        Order order = new Order(member, product, quantity, discountPolicy);
        order.showOrder();
        return order;
    }

}
