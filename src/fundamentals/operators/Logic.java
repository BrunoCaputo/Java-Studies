package fundamentals.operators;

public class Logic {
    public static void main(String[] args) {
        // 2 Conditions
        boolean c1 = true;
        boolean c2 = 500 > 650;

        System.out.println(c1 && !c2);
        System.out.println(c1 || c2);
        System.out.println(c1 ^ c2);
        System.out.println(!!c1);
        System.out.println(!c2);

        System.out.println("\nAND TRUTH TABLE");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\nOR TRUTH TABLE");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nXOR TRUTH TABLE");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nNOT TRUTH TABLE");
        System.out.println(!true);
        System.out.println(!false);
    }
}
