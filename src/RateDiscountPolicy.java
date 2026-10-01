public class RateDiscountPolicy implements DiscountPolicy {

    @Override
    public long getDiscount(Member member, Product product, int quantity) {
        if (member.getGrade() == Grade.BASIC) {
            return 0;
        } else if (member.getGrade() == Grade.VIP) {
            return product.getPrice() * quantity * 10 / 100;
        } else {
            throw new IllegalArgumentException("invalid grade");
        }
    }

}
