package hDziedziczenie;

public class Osoba extends MainDziedziczenie {
    protected String name;
    protected String surname;

    public Osoba(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void przedstawSie() {
        System.out.print("Jestem " + name + " " + surname);
    }
}