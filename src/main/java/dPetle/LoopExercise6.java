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

public class LoopExercise6 {
    public static void main(String[] args) {

        int n = 5;
        int liczbaGwiazdek = 1;
        int liczbaSpace = n - 1;

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= liczbaSpace; k++) {
                System.out.print(" ");
            }
            liczbaSpace--;


            for (int j = 1; j <= liczbaGwiazdek; j++) {
                if (liczbaGwiazdek % 2 == 0) {
                    System.out.print("*");
                }
                System.out.println();
                liczbaGwiazdek++;
            }
        }
    }
}
