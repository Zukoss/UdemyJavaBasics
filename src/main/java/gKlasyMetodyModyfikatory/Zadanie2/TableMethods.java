package gKlasyMetodyModyfikatory.Zadanie2;

public class TableMethods {
    private int[] randomTable; //{10, 142, 1111, 50, 69, 1, 0, 2569, 99, -500};

    TableMethods() {

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
