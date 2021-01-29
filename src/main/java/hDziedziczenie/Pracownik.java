package hDziedziczenie;

public class Pracownik extends Osoba {

    private final String companyName;
    private final String position;

    public Pracownik(String name, String surname, String companyName, String position) {
        super(name, surname);
        this.position = position;
        this.companyName = companyName;
    }
    @Override
    public void przedstawSie() {
        super.przedstawSie();
        System.out.print(" i pracuję w firmie " + companyName + " na stanowisku " + position + ".");
    }
}