package iExceptions;

import gClassMethodsModifiers.CMMExercise3.Math;

public class ExcExercise3 {
    public static void main(String[] args) {

        try {
            System.out.println("Circuit of circle:  " + Math.circuitOfCircle(4));
            System.out.println("Field of cicrle: " + Math.fieldOfCircle(-2));
        } catch (MinusNumbRException e) {
            System.out.println(e.getMessage());
        }
        Math.circuitOfCircle(2); //Wyjątek nie musi być koniecznie obsłużony bo dziedziczy po RuntimeException;
    }
}