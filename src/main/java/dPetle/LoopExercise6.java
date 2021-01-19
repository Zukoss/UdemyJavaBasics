package dPetle;
/*
9**. (do samodzielnego rozwiązania) Napisz program, w którym po
podaniu liczby n narysujesz za pomocą * (gwiazdki) drzewko choinkowe o wysokości n
 np. podając n = 5 powinniśmy otrzymać takie drzewko:
    *
   ***
  *****
 *******
*********
 */

import java.util.Scanner;

public class LoopExercise6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Narysujemy razem z Pawciem świąteczne drzewko! :) Wprowadź liczbę, aby wyznaczyć jego wielkość ;D ");
        System.out.println("Pamiętaj, żę maksymalna wielkość wynosi ==> 112 <==");
        int n = sc.nextInt();
        int liczbaGwiazdek = 1;
        int liczbaSpace = n - 1;

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= liczbaSpace; k++) {
                System.out.print(" ");
            }
            liczbaSpace--;


            for (int j = 1; j <= n; j++) {
                if (liczbaGwiazdek % 2 != 0) {
                    for (int s = 1; s <= liczbaGwiazdek; s++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                liczbaGwiazdek++;
                if (liczbaGwiazdek % 2 == 0) {
                    break;
                }
            }
        }
    }
}
