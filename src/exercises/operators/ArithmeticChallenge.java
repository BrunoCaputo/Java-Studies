package exercises.operators;

public class ArithmeticChallenge {

    public static void main(String[] args) {
        // a -> left side of numerator
        // b -> right side of numerator
        double a = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
        double b = Math.pow(((1 - 5) * (2 - 7)) / 2.0, 2);
        double numerator = Math.pow(a - b, 3);
        double denominator = Math.pow(10, 3);

        int result = (int) (numerator / denominator);
        System.out.println(result);
    }
}
