package dokumentacja;

/**
 * Obiekt <code>Pracownik</code> reprezentuje Pracownika, jest to nadklasa dla ...
 *
 * @author adam
 * @version 1.2.3 10/07/2018
 *
 */
public class Pracownik {

    /**
     * Kontruktor domyslny Pracownika
     */
    public Pracownik() {}


    /**
     * Konstruktor tworzacy obiekt <code>Pracownik</code> z imieniem i nazwiskiem
     * @param imie ustawia imie
     * @param nazwisko ustawia nazwisko
     */
    public Pracownik (String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    /**
     * Konstruktor tworzacy obiekt <code>Pracownik</code> z imieniem i nazwiskiem i wynagrodzeniem
     * @param imie
     * @param nazwisko
     * @param wynagrodzenie
     */
    public Pracownik (String imie, String nazwisko, double wynagrodzenie) {
        this(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }



    /**
     * imie
     */
    private String imie;
    /**
     * nazwisko
     */
    private String nazwisko;
    /**
     * wynagrodzenie
     */
    private double wynagrodzenie;

    /**
     * JAK UZYWAC
     * <pre>
     * Pracownik p = new Pracownik();
     * p.setWynagrodzenie(1000);
     * </pre>
     * @param wynagrodzenie - ustawia pracownikowi nowe wynagrodzenie
     */
    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    /**
     *
     * wynagrodzenie Pracownika w zlotowkach
     * @return - zwraca aktualne wynagrodzenie typu double
     */
    public double getWynagrodzenie() {
        return wynagrodzenie;
    }
}
