package wyjatki;

import java.util.concurrent.ExecutionException;

public class Wyjatki {

    public static void main(String[] args) {

        int a = 10;

        try {

            if (a == 10) {
                throw new NaszWyjatek("a jest rowne 10");
            }
        } catch (NaszWyjatek ex) {
            System.out.println(ex.getMessage());
        }


        try { // probuje sie wykonac

            System.out.println(5 / 0);
        } catch (Exception ex) { // jesli zlapie wyjatek - obsluguje go

            System.out.println("Wyjatek: " + ex.getMessage());
        } finally { // wykonuje sie zawsze
            System.out.println("dupa");
        }


    }

    void cosik() {

    }

    static class NaszWyjatek extends Exception {
        public NaszWyjatek(String string) {
            super(string);
        }
    }


}
