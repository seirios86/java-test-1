public class RateDiscountPolicy implements DiscountPolicy {

    @Override
    public double getDiscount(Member member, Product product) {
        if (member.getGrade().equals("BASIC")) {
            return 0;
        } else if (member.getGrade().equals("VIP")) {
            return product.getPrice() * 0.1;
        } else {
            throw new IllegalArgumentException("invalid grade");
        }
    }

}
