public interface DiscountPolicy {

    long getDiscount(Member member, Product product, int quantity);

}
