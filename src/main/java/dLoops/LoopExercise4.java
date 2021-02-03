package dLoops;

/* Napisz program, w którym po podaniu liczby n narysujesz za pomocą * (gwiazdki)
trójkąt prostokątny o przyprostokątnych
składających się z n-razy * (gwiazdki) ;)
np. podając n = 5 powinniśmy otrzymać taki trójkąt:
*
**
***
****
*****
*/

public class LoopExercise4 {
    public static void main(String[] args) {

        int n = 5;
        int liczbaGwiazdek = 1;
        int space = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= liczbaGwiazdek; j++) {
                System.out.print("*");
            }
            liczbaGwiazdek++;
        }
    }
}
