package KlasyMetody;

public class MainTest {


    public static void main(String[] args) {
        MethodTest sum = new MethodTest();

        int wynikSumy = sum.sumTest(5,3);
        System.out.println("Wynik sumy z main: " + wynikSumy);
    }
}
