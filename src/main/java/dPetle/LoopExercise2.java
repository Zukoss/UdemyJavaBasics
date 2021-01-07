package dPetle;

// Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b (a<b). Wypisz na ekran zakres liczb od a do b.

public class LoopExercise2 {
    public static void main(String[] args) {

        int a = 45;
        int b = 225;
        int x = b - a;

        for (int i = 0; i <= x; i++) {
                System.out.println(a);
                a++;
                if (a >= b+1) {
                    break;
                }
        }
    }
}
