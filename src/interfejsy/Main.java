package interfejsy;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(nazwaInterfejsu.PI);

        Pracownik[] pracowniks = new Pracownik[3];
        pracowniks[0] = new Pracownik(10000);
        pracowniks[1] = new Pracownik(1000);
        pracowniks[2] = new Pracownik(5000);


        for (Pracownik pracownik : pracowniks) {
            System.out.println(pracownik.getWynagrodzenie());
        }

        Arrays.sort(pracowniks, Collections.reverseOrder());

        for (Pracownik pracownik : pracowniks) {
            System.out.println(pracownik.getWynagrodzenie());
        }


        System.out.println(pracowniks[0].compareTo(pracowniks[1]));
    }
}
