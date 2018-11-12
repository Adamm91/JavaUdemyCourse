package ramka.zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Zdarzenia extends JFrame {

    // tworze panel oraz button
    JPanel panel = new JPanel();
    JButton redButton;
    JButton greenButton;

    // tworze konstruktor ramki
    public Zdarzenia() {

        this.setBounds(300, 300, 300, 200);
        this.setTitle("Zdarzenia");
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        initComponents();
    }

    // dodaje komponenty w oddzielnej metodzie

    private void initComponents() {
        this.getContentPane().add(panel); // dodaje panel do szkla

        redButton = new JButton("Czerwony"); // dodaje przyciski z nazwami
        greenButton = new JButton("Zielony");

        redButton.addActionListener(new Sluchacz_kolorow(Color.RED)); // przyciskom dodaje sluchacza i kolor
        greenButton.addActionListener(new Sluchacz_kolorow(Color.GREEN));


        panel.add(redButton); // dodaje przycisk do panelu
        panel.add(greenButton);

        createButton("czarny", Color.black); // moge alternatywna metoda stworzyc przyciski
    }

    public class Sluchacz_kolorow implements ActionListener { // tworze sluchacza kolorow ktory rozszerza ActionListenera

        Color kolor; // pole koloru

        public Sluchacz_kolorow(Color color) {
            this.kolor = color; // kontruktor w ktorym musze podac kolor
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(kolor); // panel zmienia tlo na podany przy wywolaniu metody kolor
        }
    }

    public void createButton (String nazwa, Color color) { // tworze metode do tworzenia przyciskow
        JButton jButton = new JButton(nazwa); // tworzy przycisk wraz z nazwa
        jButton.addActionListener(new Sluchacz_kolorow(color)); // dodaje sluchacza oraz kolor
        panel.add(jButton); // dodaje przycisk do panelu
    }
}
