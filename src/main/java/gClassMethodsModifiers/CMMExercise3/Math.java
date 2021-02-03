package gClassMethodsModifiers.CMMExercise3;

import iExceptions.MinusNumbRException;

public class Math {

    public static final double PI = 3.14;

    public static double circuitOfCircle(double radius) throws MinusNumbRException {
        if(radius <= 0) {
            throw new MinusNumbRException();
        }
            return 2 * PI * radius;

    }
    public static double fieldOfCircle(double radius) throws MinusNumbRException {
        if(radius <= 0) {
            throw new MinusNumbRException();
        }
        return PI * java.lang.Math.pow(radius, 2);
    }
    public static double circuitOfRectangle(double a, double b) {
        return (2 * a) + (2 * b);
    }
    public static double fieldOfRectangle(double a, double b) {
        return a * b;
    }
}
