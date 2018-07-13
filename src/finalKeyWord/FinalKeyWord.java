package finalKeyWord;

import java.util.Date;

public class FinalKeyWord {

    public static void main(String[] args) {

        final double PI;

        PI = 3.14;

        Pracownik p = new Pracownik();
        System.out.println(p.dataZatrudnienia);

        Pracownik pracownik = new Pracownik();
        System.out.println(pracownik.dataZatrudnienia);

    }


}

abstract class Osoba {

}

class Pracownik extends Osoba {

    Pracownik() {
        this.dataZatrudnienia = new Date();
    }
    Pracownik(Date date){
        this.dataZatrudnienia = date;
    }

    final Date dataZatrudnienia;
}
