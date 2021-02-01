package hDziedziczenie;

public class Worker extends Person {

    private final String companyName;
    private final String position;

    public Worker(String name, String surname, String companyName, String position) {
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