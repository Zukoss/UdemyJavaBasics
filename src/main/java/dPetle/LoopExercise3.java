package dPetle;
/*Napisz program, który będzie obliczał silnię z nieujemnej liczby tj. jeżeli podamy liczbę 5, to zostanie obliczona 5!
(wykrzyknik to znak silni). Obliczamy to w następujący sposób:
5! = 5 * 4 * 3 * 2 * 1 = 120.
Uważaj, bo silnia kolejnych liczb bardzo szybko rośnie i łatwo wyjść poza rozmiar typu int. */

public class LoopExercise3 {
    public static void main(String[] args) {

        // x! = 5 * 4 * 3 * 2 * 1 = 120.
        int x = 5;

        for (int i = 1; i <= x; i++) {

            for (int j = 0; j < 1; j++) {
                System.out.println(j);

            }
        }
    }
}
        //System.out.println("Wartość i: " + i);
        //int y = i;
        //y = y + 1;
        //int z = i * y;
        //System.out.println("Y: " + y);
        //System.out.println("Z: " + z);
        //System.out.println("Wartość końcowa y: " + z);
        //System.out.println();
