package fString;

/* 1. Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię, do drugiej nazwisko
    oraz do trzeciej imię i nazwisko oddzielone spacją. Następnie wykonaj polecenia używając odpowiednich
    metod z String (nie robić nic ręcznie! :) ) i wypisując informacje na ekran:

a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko

b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"

c) wypisz nazwisko z WIELKICH LITER

d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło
*/

public class StringMethods1 {
    public static void main(String[] args) {
        String name = "Paweł";
        String surname = "Żukowski";
        String nameSurname = name + " " + surname;

        System.out.println("a) Ilość znaków. Name: " + name.length() + ". Surname: " + surname.length()
                + ". NameSurname: " + nameSurname.replaceAll(" ", "").length());

        boolean egualsName = name.equals("Jan");
        boolean equalsName2 = name.equals("Alicja");
        System.out.println("b) Name równe Jan: " + egualsName);
        System.out.println("b) Name równe Alicja: " + equalsName2);

        System.out.println("c) Surname z dużych liter: " + surname.toUpperCase());

        System.out.println("d Zmiana znaku w surname z 'i' na 'a': " + surname.replaceAll("i", "a"));
    }
}
