package fundamentals;

public class Inference {

    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        var b = 4.5;    // "var" assigned "b" as double using inference
        b = 25.0;
        System.out.println(b);
    }
}
