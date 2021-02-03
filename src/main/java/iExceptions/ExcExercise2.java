package iExceptions;
/*
Zadanie 2
Analogicznie do zadania 1, zaimplementuj metodę publiczną, statyczną (w tej samej klasie co metoda main) o nazwie “podziel”,
która będzie przyjmować parametry a oraz b i zwracać wynik z dzielenia a/b. Utwórz własny wyjątek typu check, który będzie
wyrzucany w przypadku podania liczby 0 w miejsce parametru b. Spróbuj wymyślić nazwę i pamiętaj o odpowiednim dziedziczeniu.
Sprawdź działanie metody wywołując ją w main.
 */

import java.util.Scanner;

public class ExcExercise2 {
    private static int numA;
    private static int numB;

    public static int divisionByZero(int firstNum, int secondNum) throws DivisionByZeroException {
        numA = firstNum;
        numB = secondNum;
        if (secondNum == 0) {
            throw new DivisionByZeroException();
        }
        return firstNum / secondNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numA = sc.nextInt();
        numB = sc.nextInt();

        try {
            System.out.println(ExcExercise2.divisionByZero(numA, numB));
        } catch (DivisionByZeroException exception) {
            System.out.println("Cannot division by zero.");
        }
    }
}