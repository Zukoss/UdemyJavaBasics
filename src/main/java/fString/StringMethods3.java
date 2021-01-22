package fString;

/*
3. Tym razem powyższe zdanie „Potrafię coraz więcej z programowania.” napisz od tyłu „.ainawomargorp z jecęiw zaroc ęifartoP”
 */

public class StringMethods3 {
    public static void main(String[] args) {
        String verticalString = "Potrafię coraz więcej z programowania.";
        char[] verticalTable = verticalString.toCharArray();
        System.out.println("Długość tablicy to: " + verticalTable.length);

        for(int i = verticalTable.length - 1; i >= 0; i--) {
            System.out.println(verticalTable[i]);
        }

        //Second Method

        System.out.println("Second method without using lables.");

        for (int k = verticalString.length() - 1; k >= 0 ; k--) {
            System.out.print(verticalString.charAt(k));
        }
    }
}