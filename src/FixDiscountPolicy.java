public class FixDiscountPolicy implements DiscountPolicy {

    @Override
    public double getDiscount(Member member, Product product) {
        if (member.getGrade().equals("BASIC")) {
            return 0;
        } else if (member.getGrade().equals("VIP")) {
            return 1000;
        } else {
            throw new IllegalArgumentException("invalid grade");
        }
    }
}
