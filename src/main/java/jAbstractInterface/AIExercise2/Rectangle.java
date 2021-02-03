package jAbstractInterface.AIExercise2;

public class Rectangle implements Figures{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double circuit() {
        return ((2 * sideA) + (2 * sideB));
    }

    @Override
    public double field() {
        return sideA * sideB;
    }
}
