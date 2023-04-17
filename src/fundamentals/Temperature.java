package fundamentals;

public class Temperature {

    public static void main(String[] args) {
        // Formula
        // C = (F - 32) * 5/9
        final int adjustment = 32;
        final double factor = 5.0 / 9.0;

        double f = 86;
        double c = (f - adjustment) * factor;

        System.out.println("Celsius temperature: " + c + "°C");
    }
}
