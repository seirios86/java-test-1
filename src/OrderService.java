public class OrderService {

    private final DiscountPolicy discountPolicy;

    public OrderService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public void createOrder(Member member, Product product, int quantity) {
        long discount = discountPolicy.getDiscount(member, product, quantity);
        Order order = new Order(member, product, quantity, discount);
        order.showOrder();
    }

}
