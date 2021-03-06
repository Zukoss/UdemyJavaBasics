package cConditionalStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wpisz ''start'', aby rozpocząć program:");
        String start = sc.nextLine();

        while (start.equals("start")) {
            System.out.println("Podaj pierwszą liczbę: ");
            double firstNumber = sc.nextDouble();
            System.out.println("Podaj drugą liczbę: ");
            double secondNumber = sc.nextDouble();

            System.out.println("Wybierz rodzaj operacji wpisując odpowiedni znak.");
            System.out.println("Wykonanie dodawania wpisz => +");
            System.out.println("Wykonanie odejmowania wpisz => -");
            System.out.println("Wykonanie mnożenia wpisz => *");
            System.out.println("Wykonanie dzielenia wpisz => /");

            char sign = sc.next().charAt(0);

            switch (sign) {
                case '+':
                    double x = firstNumber + secondNumber;
                    System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + x);
                    break;

                case '-':
                    double y = firstNumber - secondNumber;
                    System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + y);
                    break;

                case '*':
                    double z = firstNumber * secondNumber;
                    System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + z);
                    break;

                case '/':
                    double v = firstNumber / secondNumber;
                    System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + v);
                    break;

                default:
                    System.out.println("Wpisz znak prawidłowy znak dla operacji podanych na początku programu.");
            }

            System.out.println();
            System.out.println("Wpisz ''exit'', aby przerwać program.");
            System.out.println("Wpisz ''con'', aby kontynuować program");

            String exitLoop = sc.nextLine();
            System.out.println("Wpisałeś ==> " + exitLoop + " <== ...");


            if (exitLoop.equals("exit")) {
                break;
            }
            else if (exitLoop.equals("con")) {
                System.out.println("Kontynuje program.");
            } else {
                System.out.println("Wpisz prawidłową komendę.");
            }
        }
    }
}