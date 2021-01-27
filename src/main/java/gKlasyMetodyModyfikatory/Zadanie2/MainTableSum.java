package gKlasyMetodyModyfikatory.Zadanie2;

public class MainTableSum {
    public static void main(String[] args) {
        TableMethods table = new TableMethods(10, 2, -6, 15, 30);
        TableMethods table1 = new TableMethods(400,200,500,300,100);
        TableMethods table2 = new TableMethods(10, 142, 1111, 50, 69, 1, 0, 2569, 99, -500);

        System.out.println("****************************************************");
        System.out.println("Suma liczb int tablicy1 to: " + table.allSum());
        System.out.println("Średnia z tablicy1: " + table.average());
        System.out.println("Maksymalny element tablicy1: " + table.maxTable());
        System.out.println("Minimalny element tablicy1: " + table.minTable());
        System.out.println("****************************************************");
        System.out.println("Suma liczb int tablicy2 to: " + table1.allSum());
        System.out.println("Średnia z tablicy2: " + table1.average());
        System.out.println("Maksymalny element tablicy2: " +table1.maxTable());
        System.out.println("Minimalny element tablicy2: " + table1.minTable());
        System.out.println("****************************************************");
        System.out.println("Suma liczb int tablicy3 to: " + table2.allSum());
        System.out.println("Średnia z tablicy3: " + table2.average());
        System.out.println("Maksymalny element tablicy3: " +table2.maxTable());
        System.out.println("Minimalny element tablicy3: " + table2.minTable());
        System.out.println("****************************************************");
    }
}
