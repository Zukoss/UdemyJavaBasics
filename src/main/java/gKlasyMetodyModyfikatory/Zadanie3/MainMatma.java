package gKlasyMetodyModyfikatory.Zadanie3;

public class MainMatma {
    public static void main(String[] args) {
        System.out.println("****************************************************");
        System.out.println("Circuit of circle: " + Matma.circuitOfCircle(10));
        System.out.println("Field of circle:  " + Matma.fieldOfCircle(10));
        System.out.println("****************************************************");
        System.out.println("Circuit of rectangle: " + Matma.circuitOfRectangle(5,10));
        System.out.println("Field of rectangle: " + Matma.fieldOfRectangle(5, 10));
        System.out.println("****************************************************");
        System.out.println("Tabele: ");
        //MatmaTable.TableMethods(10, 2, -6, 15, 30);
        MatmaTable.TableMethods(10, 142, 1111, 50, 69, 1, 0, 2569, 99, -500 );
        MatmaTable.TableMethods(6,7,3000,5,-1000); //Jeśli static podmienia wartości o kolejnych wartościach w tablicy (nadpisuje).

        System.out.println(MatmaTable.minTable());
        System.out.println(MatmaTable.maxTable());
        System.out.println(MatmaTable.allSum());
        System.out.println(MatmaTable.average());
    }
}
