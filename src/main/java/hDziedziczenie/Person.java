package hDziedziczenie;

public class Person extends MainDziedziczenie {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void przedstawSie() {
        System.out.print("Jestem " + name + " " + surname);
    }
}