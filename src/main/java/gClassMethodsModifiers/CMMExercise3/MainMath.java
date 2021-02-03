package gClassMethodsModifiers.CMMExercise3;

public class MainMath {
    public static void main(String[] args) {
        System.out.println("****************************************************");
        System.out.println("Circuit of circle: " + Math.circuitOfCircle(4));
        System.out.println("Field of circle:  " + Math.fieldOfCircle(4));
        System.out.println("****************************************************");
        System.out.println("Circuit of rectangle: " + Math.circuitOfRectangle(4,6));
        System.out.println("Field of rectangle: " + Math.fieldOfRectangle(4, 6));
        System.out.println("****************************************************");
        System.out.println("Tabele: ");
        //MatmaTable.TableMethods(10, 2, -6, 15, 30);
        int[] randomTable = {10, 142, 1111, 50, 69, 1, 0, 2569, 99, -500};
        int[] randomTable2 = {6,7,3000,5,-1000}; //Jeśli static podmienia wartości o kolejnych wartościach w tablicy (nadpisuje).

        System.out.println(MathTable.minTable(randomTable));
        System.out.println(MathTable.maxTable(randomTable));
        System.out.println(MathTable.allSum(randomTable));
        System.out.println(MathTable.average(randomTable));
        System.out.println("****************************************************");
        System.out.println(MathTable.minTable(randomTable2));
        System.out.println(MathTable.maxTable(randomTable2));
        System.out.println(MathTable.allSum(randomTable2));
        System.out.println(MathTable.average(randomTable2));
        System.out.println("****************************************************");
    }
}
