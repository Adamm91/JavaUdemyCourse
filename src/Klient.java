public class Klient  {

    private int id;
    private String imie;
    private static int counter = 1;

    Klient (String imie) {
        this.imie = imie;
        this.id = counter;
        counter++;
    }

    public static void main(String[] args) {

        Klient klient1 = new Klient("Adam");
        Klient klient2 = new Klient("Adam");
        Klient klient3 = new Klient("Adam");
        Klient klient4 = new Klient("Adam");

        System.out.println(klient1.id);
        System.out.println(klient2.id);
        System.out.println(klient3.id);
        System.out.println(klient4.id);


    }

}
