package agregacje;

public class Agregacja {

    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Adam", new Adres("szparatowa", 15));

        System.out.println(pracownik);
    }
}

class Pracownik {
    String imie;
    Adres adres;

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Pracownik " +
                "imie= '" + imie + '\'' +
                ", adres = " + adres;
    }
}

class Adres {
    String ulica;
    int nrDomu;

    public Adres(String ulica, int nrDomu) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", nrDomu=" + nrDomu +
                '}';
    }
}
