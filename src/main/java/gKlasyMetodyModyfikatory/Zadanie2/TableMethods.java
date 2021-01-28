package gKlasyMetodyModyfikatory.Zadanie2;

public class TableMethods {
    private int[] randomTable = new int[10]; //{10, 142, 1111, 50, 69, 1, 0, 2569, 99, -500};

    public TableMethods(int table1, int table2, int table3, int table4, int table5) {
        randomTable[0] = table1;
        randomTable[1] = table2;
        randomTable[2] = table3;
        randomTable[3] = table4;
        randomTable[4] = table5;
    }

    public TableMethods(int tabl1, int tabl2, int tabl3, int tabl4, int tabl5, int tabl6, int tabl7, int tabl8, int tabl9, int tabl10) {
        randomTable[0] = tabl1;
        randomTable[1] = tabl2;
        randomTable[2] = tabl3;
        randomTable[3] = tabl4;
        randomTable[4] = tabl5;
        randomTable[5] = tabl6; // rozwiąż dlaczego ??? Był błąd, zbyt mała ilość elementów tabeli.
        randomTable[6] = tabl7;
        randomTable[7] = tabl8;
        randomTable[8] = tabl9;
        randomTable[9] = tabl10;
    }

    public int minTable() {
        int min = randomTable[0]; // Można użyć Integer.MIN_VALUE;
        for (int i = 0; i < randomTable.length; i++) {
            if(randomTable[i] < min) {
                min = randomTable[i];
            }
        }
        return min;
    }

    public int maxTable() {
        int max = randomTable[0]; // Można użyć Integer.MAX_VALUE;
        for (int i = 0; i < randomTable.length; i++) {
            if(randomTable[i] > max) {
                max = randomTable[i];
            }
        }
        return max;
    }

    public int allSum() {
        int tableSum = 0;
        for (int i = 0; i < randomTable.length; i++) {
            tableSum += randomTable[i];
        }
        return tableSum;
    }

    public int average() {
        int tableAverage = 0;
        for (int i = 0; i < randomTable.length; i++) {
            tableAverage += randomTable[i];
            }
        tableAverage = tableAverage / randomTable.length;

        return tableAverage;
    }
}
