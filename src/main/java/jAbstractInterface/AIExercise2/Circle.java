package jAbstractInterface.AIExercise2;

import static gClassMethodsModifiers.CMMExercise3.Math.PI;

public class Circle implements Figures {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double circuit() {
        return 2 * PI * radius;
    }

    @Override
    public double field() {
        return PI * Math.pow(radius, 2);
    }
}
