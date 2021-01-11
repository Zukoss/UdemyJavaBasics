package dPetle;
/*Napisz program, który będzie obliczał silnię z nieujemnej liczby tj. jeżeli podamy liczbę 5, to zostanie obliczona 5!
(wykrzyknik to znak silni). Obliczamy to w następujący sposób:
5! = 5 * 4 * 3 * 2 * 1 = 120.
Uważaj, bo silnia kolejnych liczb bardzo szybko rośnie i łatwo wyjść poza rozmiar typu int. */

public class LoopExercise3 {
    public static void main(String[] args) {

        // x! = 5 * 4 * 3 * 2 * 1 = 120.
        int x = 5;
        int s = 1;
        int c = 1;

        for (int i = 1; i <= x ; i++ ) {
            s++;
            s = c;
            s = s * (c - 1);
            System.out.println(s);
        }
    }
}
