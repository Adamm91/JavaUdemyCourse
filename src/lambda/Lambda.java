package lambda;

public class Lambda {


    public static void main(String[] args) {

        //                @Override
//            ZachowaniePoWcisnieciu y = new ZachowaniePoWcisnieciu() {
//                public void akcja() {
//                    System.out.println("Jestem z klasy anonimowej");
//                }
//            };

        ZachowaniePoWcisnieciu y = () -> {
            System.out.println("Jestem z klasy anonimowej");
        };

        Przycisk p = new Przycisk(); // tworzymy przycisk


        ZachowaniePoWcisnieciu2 z = (int a, int b) -> {

            System.out.println(a + b);

        };

        p.dodajAkcje2(3, 4, z);
    }
}

interface ZachowaniePoWcisnieciu {
    void akcja();
}

interface ZachowaniePoWcisnieciu2 {
    void akcja2(int a, int b);
}

class Przycisk {

    void dodajAkcje(ZachowaniePoWcisnieciu z) {
        z.akcja();
    }

    void dodajAkcje2(int a, int b, ZachowaniePoWcisnieciu2 z) {
        z.akcja2(a, b);
    }


}
