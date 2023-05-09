package classes;

public class Product {

  String name;
  double price;
  static double discount = 0.25;

  /**
   * Default Constructor
   */
  Product() {
  }

  Product(String initialName, double initialPrice) {
    name = initialName;
    price = initialPrice;
  }

  double discountedPrice() {
    return price * (1 - discount);
  }
}
