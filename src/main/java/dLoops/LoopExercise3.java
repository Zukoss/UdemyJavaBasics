package dLoops;
/*Napisz program, który będzie obliczał silnię z nieujemnej liczby tj. jeżeli podamy liczbę 5, to zostanie obliczona 5!
(wykrzyknik to znak silni). Obliczamy to w następujący sposób:
5! = 5 * 4 * 3 * 2 * 1 = 120.
Uważaj, bo silnia kolejnych liczb bardzo szybko rośnie i łatwo wyjść poza rozmiar typu int. */

public class LoopExercise3 {
    public static void main(String[] args) {

        // x! = 5 * 4 * 3 * 2 * 1 = 120.
        int n = 5;
        int i = 1;
        int s = 1;

        for (; i <= n ; i++ ) {
            s = s * i;
        }
        System.out.println("Silnia z " + n + "! = " + s);
    }
}
