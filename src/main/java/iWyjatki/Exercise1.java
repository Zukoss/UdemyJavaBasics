package iWyjatki;
/*
Zadanie 1
W metodzie main napisz kawałek kodu, który będzie dzielił liczby a/b (typu int) i wypisywał wynik na ekran.
Zobacz co się stanie, jeżeli pod b podasz liczbę 0. Spróbuj obsłużyć błąd try/catchem,
aby w przypadku dzielenia przez zero wyskoczył użytkownikowi komunikat:
“Nie wolno dzielić przez 0!”
(podpowiedź: należy obsłużyć wyjątek ArithmeticException)
 */

public class Exercise1 {
    int a;
    int b;

    public double division(int firstNum, int secondNum) {
        a = firstNum;
        b = secondNum;
        return a / b;
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();

        try {
            System.out.println(exercise1.division(5, 0));
        } catch (ArithmeticException exception) {
            System.out.println("Cannot by divided by zero.");
        }
    }
}
