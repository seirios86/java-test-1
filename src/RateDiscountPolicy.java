public class RateDiscountPolicy implements DiscountPolicy {

    @Override
    public long getDiscount(Member member, Product product, int quantity) {
        if (member.getGrade().equals("BASIC")) {
            return 0;
        } else if (member.getGrade().equals("VIP")) {
            return (long) (product.getPrice() * 0.1 * quantity);
        } else {
            throw new IllegalArgumentException("invalid grade");
        }
    }

}
