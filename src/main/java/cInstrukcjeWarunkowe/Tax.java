package cInstrukcjeWarunkowe;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int taxLimit = 85528;
        double minTax = 0.17;
        double maxTax = 0.32;

        System.out.println("Wprowadź wysokość przychodu:");
        int myTax = sc.nextInt();

        if (myTax > taxLimit) {
            double x = ((myTax - taxLimit) * maxTax);
            System.out.println("Twój podatek to: " + x);
        }
    }
}
