package gKlasyMetodyModyfikatory.Zadanie3;

public class MainMatma {
    public static void main(String[] args) {
        System.out.println("****************************************************");
        System.out.println("Circuit of circle: " + Matma.circuitOfCircle(4));
        System.out.println("Field of circle:  " + Matma.fieldOfCircle(4));
        System.out.println("****************************************************");
        System.out.println("Circuit of rectangle: " + Matma.circuitOfRectangle(4,6));
        System.out.println("Field of rectangle: " + Matma.fieldOfRectangle(4, 6));
        System.out.println("****************************************************");
        System.out.println("Tabele: ");
        //MatmaTable.TableMethods(10, 2, -6, 15, 30);
        int[] randomTable = {10, 142, 1111, 50, 69, 1, 0, 2569, 99, -500};
        int[] randomTable2 = {6,7,3000,5,-1000}; //Jeśli static podmienia wartości o kolejnych wartościach w tablicy (nadpisuje).

        System.out.println(MatmaTable.minTable(randomTable));
        System.out.println(MatmaTable.maxTable(randomTable));
        System.out.println(MatmaTable.allSum(randomTable));
        System.out.println(MatmaTable.average(randomTable));
        System.out.println("****************************************************");
        System.out.println(MatmaTable.minTable(randomTable2));
        System.out.println(MatmaTable.maxTable(randomTable2));
        System.out.println(MatmaTable.allSum(randomTable2));
        System.out.println(MatmaTable.average(randomTable2));
        System.out.println("****************************************************");
    }
}
