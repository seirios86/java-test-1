public class Product {

    private final String name;
    private final long price;

    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }

    long getPrice() {
        return price;
    }

}
