package gKlasyMetodyModyfikatory.Zadanie3;

public class Matma {

    public static final double PI = 3.14;

    public static double circuitOfCircle(double radius) {
        return 2 * PI * radius;
    }
    public static double fieldOfCircle(double radius) {
        return PI * Math.pow(radius, 2);
    }
    public static double circuitOfRectangle(double a, double b) {
        return (2 * a) + (2 * b);
    }
    public static double fieldOfRectangle(double a, double b) {
        return a * b;
    }
}
