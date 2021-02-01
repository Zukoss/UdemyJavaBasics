package jAbstractInterface;

import jAbstractInterface.Exercise1.DeathStar;
import jAbstractInterface.Exercise2.Circle;
import jAbstractInterface.Exercise2.Rectangle;

public class MainAI {
    public static void main(String[] args) {
        DeathStar deathStar = new DeathStar();
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(4,5);
        deathStar.laserAttack();
        System.out.println();
        System.out.println("Circuit of circle: " + circle.circuit() + " m.");
        System.out.println("Field of circle: " + circle.field() + " m2.");
        System.out.println();
        System.out.println("Circuit of rectangle: " + rectangle.circuit() + " m.");
        System.out.println("Field of rectangle: " + rectangle.field() + " m2.");
    }
}
