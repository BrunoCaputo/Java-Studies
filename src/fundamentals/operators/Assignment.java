package fundamentals.operators;

public class Assignment {

    public static void main(String[] args) {
        int a = 6;
        int b = a + 5;
        int c = a + b;

        c += b; // c = c + b
        c -= a; // c = c - a
        c *= b; // c = c * b
        c /= a; // c = c / a
        c %= 2; // c = c % 2

        System.out.println(c);
    }
}
