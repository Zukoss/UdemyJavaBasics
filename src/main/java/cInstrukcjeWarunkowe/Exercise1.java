package cInstrukcjeWarunkowe;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadź liczbę: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Liczba jest parzysta.");
        } else  {
            System.out.println("Liczba jest nieparzysta.");
        }
    }
}