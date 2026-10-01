public class OrderService {

    public Order createOrder(Member member, Product product, int quantity, DiscountPolicy discountPolicy) {
        double discount = discountPolicy.getDiscount(member, product);
        Order order = new Order(member, product, quantity, discount);
        order.showOrder();
        return order;
    }

}
