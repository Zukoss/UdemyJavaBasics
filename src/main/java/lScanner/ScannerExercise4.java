package lScanner;
//Zadanie 4
//Wczytuj liczby i licz ich sumę. Zakończ działanie w momencie napotkania liczby ujemnej

import java.util.Scanner;

public class ScannerExercise4 {
    Scanner sc = new Scanner(System.in);
    boolean loop = true;
    int numbA;
    int numbB;

    void sumScanner() {

        while (loop) {
            if (numbA > 0 && numbB > 0) {
                System.out.println("Enter first number:");
                numbA = sc.nextInt();
                System.out.println("Enter second number");
                numbB = sc.nextInt();
                int sumResult = numbA + numbB;
                System.out.println("Sum result: " + sumResult);
            }
            loop = false;
            System.out.println("Enter more than minus and zero.");
        }
    }

    public static void main(String[] args) {
        ScannerExercise4 scs = new ScannerExercise4();
        scs.sumScanner();


    }
}
