package classes;

public class CircArea {
    double radius;
    final static double PI = Math.PI;

    public CircArea(double initialRadius) {
        radius = initialRadius;
    }

    double area() {
        return Math.pow(radius, 2) * PI;
    }
}
