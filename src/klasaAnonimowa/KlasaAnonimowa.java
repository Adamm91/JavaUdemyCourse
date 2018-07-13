package klasaAnonimowa;

public class KlasaAnonimowa {

    public static void main(String[] args) {

//        ZachowaniePoWcisnieciu z = new Przycisk1();
//        z.akcja();

        ZachowaniePoWcisnieciu y = new ZachowaniePoWcisnieciu() {
            @Override
            public void akcja() {
                System.out.println("Jestem z klasy anonimowej");
            }
        };

        Przycisk przycisk = new Przycisk(); // tworzymy przycisk

        przycisk.dodajAkcje(y); // dodajemy akcje przycisku - 'y', ktora okreslilismy wyzej jako klase anonimowa

        Przycisk przycisk1 = new Przycisk(); // tworzymy kolejny przycisk

        przycisk1.dodajAkcje(new ZachowaniePoWcisnieciu() { // dodajemy akcje w konstruktorze okreslajac zachowanie
            @Override
            public void akcja() {
                System.out.println("glosniej");
            }
        });

    }
}

interface ZachowaniePoWcisnieciu {
    void akcja();
}

class Przycisk {

    void dodajAkcje (ZachowaniePoWcisnieciu z) {
        z.akcja();
    }
}

//class Przycisk1 implements ZachowaniePoWcisnieciu{
//
//    @Override
//    public void akcja() {
//        System.out.println("Jestem z przycisku 1");
//    }
//}



