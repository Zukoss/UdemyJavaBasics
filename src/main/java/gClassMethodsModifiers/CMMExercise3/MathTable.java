package gClassMethodsModifiers.CMMExercise3;

public class MathTable {

    public static int minTable(int[] randomTable) {
        int min = randomTable[0];
        for (int j : randomTable) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int maxTable(int[] randomTable) {
        int max = randomTable[0];
        for (int j : randomTable) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int allSum(int[] randomTable) {
        int tableSum = 0;
        for (int j : randomTable) {
            tableSum += j;
        }
        return tableSum;
    }

    public static int average(int[] randomTable) {
        int tableAverage = 0;
        for (int j : randomTable) {
            tableAverage += j;
        }
        tableAverage = tableAverage / randomTable.length;
        return tableAverage;
    }
}
