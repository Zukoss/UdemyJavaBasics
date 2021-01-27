package gKlasyMetodyModyfikatory.Zadanie1;

public class Programmer {
    private String name;
    private String surname;
    private String languageTech;
    private int earnings;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getLanguageTech() {
        return languageTech;
    }
    public int getEarnings() {
        return earnings;
    }

    public Programmer() {
    }

    public Programmer(String setName, String setSurname, String setLanguageTech, int setEarnings) {
        name = setName;
        surname = setSurname;
        languageTech = setLanguageTech;
        earnings = setEarnings;
    }
}
