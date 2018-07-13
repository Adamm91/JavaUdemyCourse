package klasy_zagniezdzone;

public class Main {

    public static void main(String[] args) {

        KontoBankowe kontoBankowe = new KontoBankowe(1000);

        System.out.println(kontoBankowe.getStanKonta());
        kontoBankowe.startKonta(5);
        System.out.println(kontoBankowe.getStanKonta());



    }
}

class KontoBankowe {

    private double stanKonta;

    KontoBankowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    class Odsetki {

        private double stopaProcentowa;

        Odsetki (double stopaProcentowa) {
            this.stopaProcentowa = stopaProcentowa;
        }

        void zmienStanKonta () {
            double tmp = (stopaProcentowa * stanKonta) / 100;
            stanKonta += tmp;
        }
    }

    void startKonta (double stopaProcentowa) {
        Odsetki odsetki = new Odsetki(stopaProcentowa);
        odsetki.zmienStanKonta();
    }

    public double getStanKonta() {
        return stanKonta;
    }

}