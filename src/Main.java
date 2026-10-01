public class Main {

    public static void main(String[] args) {
        Member member = new Member("Harvey", Grade.VIP);
        Product product = new Product("Keyboard", 100000);

//        OrderService orderService = new OrderService(new RateDiscountPolicy());
        OrderService orderService = new OrderService(new FixDiscountPolicy());
        orderService.createOrder(member, product, 2);
    }

}