package cInstrukcjeWarunkowe;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int taxLimit = 85528;
        double minTax = 0.17;
        double maxTax = 0.32;

        System.out.println("Wprowadź wysokość przychodu w złotówkach:");
        int myIncome = sc.nextInt();
        if (myIncome > 0) {
            if (myIncome > taxLimit) {
                double taxConstant = taxLimit * minTax;
                double maxTaxLimit = ((myIncome - taxLimit) * maxTax);
                double myTax = taxConstant + maxTaxLimit;
                System.out.println("Twój podatek to: " + myTax + " zł.");
            }

            if (myIncome < taxLimit) {
                double myTax = myIncome * minTax;
                System.out.println("Twój podatek to: " + myTax + " zł.");
            }
        }
        System.out.println("Wprowadź dodatnią sumę dochodu.");
    }
}