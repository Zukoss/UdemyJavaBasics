package lScanner;

//Zadanie 3
// Wczytaj całą linię tekstu z klawiatury. Następnie pobierz liczbę.
// Wypisz na ekran wczytaną linię tyle razy ile wynosi podana liczba

import java.util.Scanner;

public class ScannerExercise3 {
    Scanner sc = new Scanner(System.in);


    void scannerMethod() {
        System.out.println("Enter text line:");
        String line = sc.nextLine();
        System.out.println("Enter line loop:");
        int numb = sc.nextInt();

        for (int i = 1; i <= numb; i++) {
            System.out.println(i + ". " + line);
        }
    }
    public static void main(String[] args) {
        ScannerExercise3 scm = new ScannerExercise3();
        scm.scannerMethod();
    }
}
