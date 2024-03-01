public class Student {
    private String meno;
    private String priezvisko;
    private String osobneCislo;

    public Student(String meno, String priezvisko, String osobneCislo) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.osobneCislo = osobneCislo;
    }

    public String getMeno() {
        return this.meno;
    }

    public String getPriezvisko() {
        return this.priezvisko;
    }

    public String getOsobneCislo() {
        return this.osobneCislo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "meno='" + this.meno + '\'' +
                ", priezvisko='" + this.priezvisko + '\'' +
                ", osobneCislo='" + this.osobneCislo + '\'' +
                '}';
    }
}
