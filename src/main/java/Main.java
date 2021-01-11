public class Main {



    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int s = 1;

        while(i <= n) {
            s = s * i;
            i++;
        }

        System.out.print(n);
        System.out.print("! = ");
        System.out.println(s);
    }
}