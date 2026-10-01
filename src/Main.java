public class Main {

    private final static OrderService orderService = new OrderService();

    public static void main(String[] args) {
        Member member = new Member("Harvey", "VIP");
        Product product = new Product("Keyboard", 100000);

//        Order order = orderService.createOrder(member, product, 2, new RateDiscountPolicy());
        Order order = orderService.createOrder(member, product, 2, new FixDiscountPolicy());
    }

}