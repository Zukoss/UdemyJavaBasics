package gKlasyMetodyModyfikatory.Zadanie1;

public class MainProgrammer {
    public static void main(String[] args) {
        Programmer firstProgrammer = new Programmer("Paweł", "Żukowski", "Java", 14500);
        Programmer secondProgramer = new Programmer("Piotr", "Frączek", "Kotlin", 12000);

        Programmer thirdProgrammer = new Programmer();

        System.out.println("Name: " + firstProgrammer.getName());
        System.out.println("Surname: " + firstProgrammer.getSurname());
        System.out.println("LanguageTech: " + firstProgrammer.getLanguageTech());
        System.out.println("Earnings: " + firstProgrammer.getEarnings());

        System.out.println(secondProgramer.getSurname());
        System.out.println(thirdProgrammer.getSurname());
        System.out.println(thirdProgrammer.getEarnings());
    }
}
