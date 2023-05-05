package classes;

public class Product {

    String name;
    double price;
    double discount;

    /**
     * Default Constructor
     */
    Product() {
    }

    Product(String initialName, double initialPrice, double initialDiscount) {
        name = initialName;
        price = initialPrice;
        discount = initialDiscount;
    }

    double discountedPrice() {
        return price * (1 - discount);
    }
}
