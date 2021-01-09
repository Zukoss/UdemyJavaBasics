package dPetle;

public class LoopArraySum {
    public static void main(String[] args) {

        int[] table = new int[10];
        int suma = 0;
        int x = 0;


        for (int i = 0; i <= 9; i++) {

            x = table[i] = x;
            x++;
            System.out.println(x);
            suma = suma + x;
            System.out.println("Suma tabeli: " + suma);
        }

        System.out.println();
        System.out.println("Wartość poza pętlą: " + x);
        System.out.println();
        System.out.println(table[0]);
        System.out.println(table[1]);
        System.out.println(table[2]);
        System.out.println(table[3]);
        System.out.println(table[4]);
        System.out.println(table[5]);
        System.out.println(table[6]);
        System.out.println(table[7]);
        System.out.println(table[8]);
        System.out.println(table[9]);
    }
}
