package jAbstractInterface;

import jAbstractInterface.AIExercise1.DeathStar;
import jAbstractInterface.AIExercise2.Circle;
import jAbstractInterface.AIExercise2.Rectangle;

public class MainAI {

    public interface Info {
        void showInfo();
    }


    public static void main(String[] args) {
        DeathStar deathStar = new DeathStar();
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println();
        deathStar.laserAttack();
        System.out.println();
        System.out.println("Circuit of circle: " + circle.circuit() + " m.");
        System.out.println("Field of circle: " + circle.field() + " m2.");
        System.out.println();
        System.out.println("Circuit of rectangle: " + rectangle.circuit() + " m.");
        System.out.println("Field of rectangle: " + rectangle.field() + " m2.");

        Info infoAnonymous = new Info() {
            @Override
            public void showInfo() {
                System.out.println("Info taken from anonymous class.");
            }
        };
        System.out.println();
        infoAnonymous.showInfo();

    }
}