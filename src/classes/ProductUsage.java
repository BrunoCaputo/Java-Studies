package classes;

public class ProductUsage {

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 5433.54, 0.15);

        // Using default Constructor
        var p2 = new Product();
        p2.name = "Cellphone";
        p2.price = 2533.99;
        p2.discount = 0.1;

        System.out.println(p1.name);
        System.out.println(p2.name);

        double finalPrice1 = p1.discountedPrice();
        double finalPrice2 = p2.discountedPrice();
        double cartPrice = finalPrice1 + finalPrice2;

        System.out.printf("Cart Price: $%.2f\n", cartPrice);
    }
}
