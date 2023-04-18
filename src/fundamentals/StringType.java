package fundamentals;

public class StringType {

    public static void main(String[] args) {
        String name = "Bruno";
        String lastName = "Caputo";
        byte age = 24;
        float salary = 10902.345F;

        System.out.println(
                "Name: " + name
                        + "\nLast name: " + lastName
                        + "\nAge: " + age
                        + "\nSalary: " + salary
        );

        System.out.printf(
                "%s %s is %d years old and earns R$%.2f every month",
                name,
                lastName,
                age,
                salary
        );

        // Same result, but assigning to a string variable
        String sentence = String.format(
                "%s %s is %d years old and earns R$%.2f every month",
                name,
                lastName,
                age,
                salary
        );
        System.out.println(sentence);
    }
}
