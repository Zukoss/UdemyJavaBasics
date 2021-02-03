package dLoops;

public class LoopExercise5 {
    public static void main(String[] args) {

        int n = 10;
        int liczbaGwiazdek = 1;
        int liczbaSpace = n - 1;

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= liczbaSpace; k++) {
                System.out.print(" ");
            }
            liczbaSpace--;


            for (int j = 1; j <= liczbaGwiazdek; j++) {
                System.out.print("*");
            }
            System.out.println();
            liczbaGwiazdek++;
        }
    }
}