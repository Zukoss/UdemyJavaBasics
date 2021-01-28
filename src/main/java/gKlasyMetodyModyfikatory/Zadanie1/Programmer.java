package gKlasyMetodyModyfikatory.Zadanie1;

public class Programmer {
    private String name;
    private String surname;
    private String languageTech;
    private double earnings;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getLanguageTech() {
        return languageTech;
    }
    public double getEarnings() {
        return earnings;
    }

    public Programmer() {
    }

    public Programmer(String setName, String setSurname, String setLanguageTech, double setEarnings) {
        name = setName;
        surname = setSurname;
        languageTech = setLanguageTech;
        earnings = setEarnings;
    }
}
