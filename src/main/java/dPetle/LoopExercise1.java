package dPetle;

public class LoopExercise1 {
    public static void main(String[] args) {
        int loopInt = 0;

        for (int x = 0; x < 31; x++) {
            System.out.println(loopInt);
            loopInt++;
        }

        System.out.println();
        loopInt = 30;

        for (int x = 0; x < 31; x++) {
            System.out.println(loopInt);
            loopInt--;
        }
    }
}
