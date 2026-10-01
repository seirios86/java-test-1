public class Product {

    private String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

}
