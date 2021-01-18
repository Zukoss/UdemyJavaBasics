public class Main {



    public static void main(String[] args) {

        int liczbaGwiazdek = 1;
        int count = 10;

        for (int j = 1; j <= count; j++) {
            if (liczbaGwiazdek % 2 != 0) {
                System.out.print("*");
            }
            System.out.println();
            liczbaGwiazdek++;
        }
    }
}