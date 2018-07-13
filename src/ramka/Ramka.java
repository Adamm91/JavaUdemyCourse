package ramka;

import java.awt.*;
import javax.swing.*;

public class Ramka {

    public Ramka() {

        JFrame frame = new JFrame("tytul ramki"); // tworzymy ramke
//        frame.setTitle("tytul ramki"); nadajemy tytul ramce - to samo co wyzej
//        frame.setSize(100, 100); // ustawimy wielkosc ramki
//        frame.setLocation(200, 100); // ustawiamy polozenie ramki x -> w prawo, y -> w dol
        frame.setBounds(200, 100, 100, 100);// ustawiamy polozenie oraz rozmiar
        frame.setVisible(true); // ustawiamy widocznosc ramki
        frame.setResizable(false); // ustawiamy brak mozliwosci zmiany rozmiaru ramki
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("apple logo.jpg"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setDefaultCloseOperation(3);  <- zamyka apllikacje po zamknieciu ramki, to samo co wyzej
    }

    public static void main(String[] args) {
        Ramka ramka = new Ramka();

    }
}
