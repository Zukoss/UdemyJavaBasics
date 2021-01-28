package gKlasyMetodyModyfikatory.Zadanie3;

public class Matma {
    public static int[] randomTable = new int[10];
    public static final double PI = 3.14;

    public static double circuitOfCircle(double radius) {
        double circuitOfCircle = 2 * PI * radius;
        return circuitOfCircle;
    }
    public static double fieldOfCircle(double radius) {
        double fieldOfCircle = PI * Math.pow(radius, 2);
        return fieldOfCircle;
    }
    public static double circuitOfRectangle(double a, double b) {
        double circuitOfRectangle = (2 * a) + (2 * b);
        return circuitOfRectangle;
    }
    public static double fieldOfRectangle(double a, double b) {
        double fieldOfRectangle = a * b;
        return fieldOfRectangle;
    }

    public int minTable() {
        int min = randomTable[0];
        for (int i = 0; i < randomTable.length; i++) {
            if(randomTable[i] < min) {
                min = randomTable[i];
            }
        }
        return min;
    }
}
