public class Order {

    private final Member member;
    private final Product product;
    private final int quantity;
    private final long discount;
    private DiscountPolicy discountPolicy;

    public Order(Member member, Product product, int quantity, DiscountPolicy discountPolicy) {
        this.member = member;
        this.product = product;
        this.quantity = quantity;
        this.discount = discountPolicy.getDiscount(member, product, quantity);
    }

    public void showOrder() {
        long orderAmount = product.getPrice() * quantity;
        long payAmount = orderAmount - discount;
        System.out.println("주문 금액: " + orderAmount);
        System.out.println("할인 금액: " + discount);
        System.out.println("결제 금액: " + ((payAmount < 0) ? 0 : payAmount));
    }

}
