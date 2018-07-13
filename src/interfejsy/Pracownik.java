package interfejsy;

public class Pracownik implements nazwaInterfejsu, cos, Comparable{
    @Override
    public void cos() {

    }

    public Pracownik(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    private double wynagrodzenie;
    public double getWynagrodzenie() {
        return this.wynagrodzenie;
    }

    @Override
    public int compareTo(Object o) {
        Pracownik przyslany = (Pracownik)o;
        if (this.wynagrodzenie < przyslany.wynagrodzenie)
            return -1;
            else if (this.wynagrodzenie > przyslany.wynagrodzenie)
                return 1;
            return 0;
    }
}
