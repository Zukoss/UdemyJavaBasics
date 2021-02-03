package dLoops;

// Utwórz tablicę rozmiaru 10 elementów i uzupełnij liczbami. Wypisz wszystkie liczby z tej tablicy na ekran. Następnie wypisz wszystkie liczby od tyłu.

public class LoopArray {
    public static void main(String[] args) {
        int[] table = new int[10];
        int count = 0;

        for (int i = 0; i < table.length; i++) {
            System.out.println("Index + tablicy to: " + i);
            table[i] = count;
            System.out.println("Wartość podnoszona do tablicy to: " +table[i]);
            count++;
        }

        count--;
        System.out.println();

        for (int j = 0; j < table.length; j++) {
            System.out.println("Index - tablicy to: " + j);
            table[j] = count;
            System.out.println("Wartość podnoszona do tablicy to: " +table[j]);
            count--;
        }
    }
}