package iWyjatki;

import gKlasyMetodyModyfikatory.Zadanie3.Matma;

public class Exercise3 {
    public static void main(String[] args) {

        try {
            System.out.println("Circuit of circle:  " + Matma.circuitOfCircle(2));
            System.out.println("Field of cicrle: " + Matma.fieldOfCircle(-2));
        } catch (MinusNumbRException e) {
            System.out.println("Enter more than zero.");
        }
        Matma.circuitOfCircle(-1); //Wyjątek nie musi być koniecznie obsłużony bo dziedziczy po RuntimeException;
    }
}