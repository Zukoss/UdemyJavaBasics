package fString;

/*
2. Dla zdania "Potrafię coraz więcej z programowania." wypisz w pionie każdy znak w osobnej linii, czyli:
*/
public class StringMethods2 {
    public static void main(String[] args) {
        String verticalString = "Potrafię coraz więcej z programowania.";
        char[] verticalTable = verticalString.toCharArray();
        System.out.println(verticalTable);

        for(int i = 0; i < verticalTable.length; i++) {
            System.out.println(verticalTable[i]);
        }

        //Secod Method
        System.out.println("Second method without using table.");

        for (int k = 0; k < verticalString.length(); k++) {
            System.out.println(verticalString.charAt(k));
        }

    }
}
