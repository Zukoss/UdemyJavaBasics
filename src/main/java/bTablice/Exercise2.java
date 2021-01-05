package bTablice;

public class Exercise2 {
    public static void main(String[] args) {
        int tabDwu[][] = new int[][]{
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50}
        };

        int sumTabDwu0 = tabDwu[0][0]+tabDwu[0][1]+tabDwu[0][2]+tabDwu[0][3]+tabDwu[0][4];
        int sumTabDwu1 = tabDwu[1][0]+tabDwu[1][1]+tabDwu[1][2]+tabDwu[1][3]+tabDwu[1][4];
        int sumTabDwu2 = tabDwu[2][0]+tabDwu[2][1]+tabDwu[2][2]+tabDwu[2][3]+tabDwu[2][4];

        System.out.println("Suma tablicy wiersz 0: " + sumTabDwu0);
        System.out.println("Suma tablicy wiersz 1: " + sumTabDwu1);
        System.out.println("Suma tablicy wiersz 2: " + sumTabDwu2);

        int sumTabAll = sumTabDwu0 + sumTabDwu1 + sumTabDwu2;
        System.out.println();

        System.out.println("Suma całej tablicy dwuwymiarowej: " + sumTabAll);
    }
}
