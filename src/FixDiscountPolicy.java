public class FixDiscountPolicy implements DiscountPolicy {

    @Override
    public long getDiscount(Member member, Product product, int quantity) {
        if (member.getGrade() == Grade.BASIC) {
            return 0;
        } else if (member.getGrade() == Grade.VIP) {
            return 1000L * quantity;
        } else {
            throw new IllegalArgumentException("invalid grade");
        }
    }
}
