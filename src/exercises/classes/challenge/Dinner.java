package exercises.classes.challenge;

public class Dinner {

  public static void main(String[] args) {
    Food f1 = new Food("Rice", 0.1);
    Food f2 = new Food("Beans", 0.085);
    Food f3 = new Food("Meat", 0.1255);

    Person p1 = new Person("Bruno", 102.4);

    System.out.printf("Weight before dinner %.2fkg\n", p1.weight);
    p1.eat(f1);
    p1.eat(f2);
    p1.eat(f3);
    System.out.printf("Weight after dinner %.2fkg\n", p1.weight);
  }
}
