package lScanner;
/*Zadanie 1
Wykorzystując Scanner wczytaj wpisane z klawiatury imię, nazwisko oraz wzrost.
Następnie wypisz na ekran zdanie:
“Jestem <imię> <nazwisko> i mam <wzrost> cm wzrostu”*/

import java.util.Scanner;

public class ScannerExercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write name:");
        String name = sc.nextLine();
        System.out.println("Write surname:");
        String surname = sc.nextLine();
        System.out.println("Write tall (type without unit):");
        String tall = sc.nextLine();

        System.out.println("I'm " + name + " " + surname + " and I am " + tall + " cm tall. ");
    }
}
