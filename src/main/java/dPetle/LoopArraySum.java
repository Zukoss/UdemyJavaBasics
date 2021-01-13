package dPetle;

public class LoopArraySum {
    public static void main(String[] args) {

        int[] table = new int[10];
        int suma = 0;
        int x = 0;


        for (int i = 0; i < table.length; i++) {

            x = table[i] = x;
            x++;
            System.out.println(x);
            suma += + x;
            System.out.println("Suma tabeli: " + suma);
        }
    }
}
