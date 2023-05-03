package classes;

public class ProductUsage {

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Laptop";
        p1.price = 5433.54;
        p1.discount = 0.15;

        var p2 = new Product();
        p2.name = "Cellphone";
        p2.price = 2533.99;
        p2.discount = 0.1;

        System.out.println(p1.name);
        System.out.println(p2.name);

        double finalPrice1 = p1.price * (1 - p1.discount);
        double finalPrice2 = p2.price * (1 - p2.discount);
        double cartPrice = finalPrice1 + finalPrice2;

        System.out.printf("Cart Price: $%.2f\n", cartPrice);
    }
}
