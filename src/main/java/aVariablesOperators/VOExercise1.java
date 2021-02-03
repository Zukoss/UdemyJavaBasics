package aVariablesOperators;

public class VOExercise1 {
    public static void main(String[] args) {

        int wiek; // w latach
        float wzrost; // w metrach
        int waga; // w kilogramach

        wiek = 32;
        wzrost = 1.97f;
        waga = 100;

        System.out.println();

        System.out.println("Wiek : " + wiek + " - w latach.");
        System.out.println("Wzrost : " + wzrost + " - w metrach.");
        System.out.println("Waga : " + waga + " - w kilogramach.");

        System.out.println();

        float bodyMassIndex;
        bodyMassIndex = waga / (float) Math.pow(wzrost,2); // Metoda Math podnoszenia do potęgi, inaczej (wzrost * wzrost)

        System.out.println("Body Mass Index jako float to: " + bodyMassIndex);
        System.out.println("Body Mass Index jako int to: " + (int) bodyMassIndex);

        /* 4. Podaj dowolną liczbę typu całkowitego.
        Następnie oblicz wynik dzielenia oraz resztę z dzielenia przez liczby 2, 3 oraz 11.
        Zobacz czy wyniki zgadzają się z Twoimi oczekiwaniami.
         */
        System.out.println();
        int a = 100;
        System.out.println("Wybrana liczba: " + a);

        int wynikd = a / 2;
        int wynikr = a % 2;
        System.out.println("Wynik dzielenia przez 2: " + wynikd);
        System.out.println("Wynik reszty z dzielenia przez 2 to: " + wynikr);
        wynikd = a / 3;
        wynikr = a % 3;
        System.out.println("Wynik dzielenia przez 3: " + wynikd);
        System.out.println("Wynik reszty z dzielenia przez 3 to: " + wynikr);
        wynikd = a / 11;
        wynikr = a % 11;
        System.out.println("Wynik dzielenia przez 11: " + wynikd);
        System.out.println("Wynik reszty z dzielenia przez 11 to: " + wynikr);

        System.out.println();

        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);

        System.out.println();

        long maxLong = 1234567890123456789L;
        int maxRange = (int) 1234567890123456789L;
        System.out.println(maxRange);
    }
}