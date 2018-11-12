package ramka.zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zdarzenia2 extends JFrame { // to samo co Zdarzenia, jednak maksymalnie skrocony zapis

    public static void main(String[] args) {
        new Zdarzenia2();
    }

    JPanel panel = new JPanel(); // tworze panel

    public Zdarzenia2() { // tworze konstruktor
        super("super");
        this.setDefaultCloseOperation(3);
        this.setBounds(300, 300, 300, 300);
        this.setVisible(true);
        initComponents();
    }

    private void initComponents() { // dodaje panel i przyciski
        this.getContentPane().add(panel);
        createButton("czerwony", Color.RED);
        createButton("zielony", Color.GREEN);
        createButton("niebieski", Color.BLUE);
    }

    private void createButton (String nazwa, Color k) { // metoda tworzaca przyciski
        JButton jButton = new JButton(nazwa);
        jButton.addActionListener(new ActionListener() { // kazdy przycisk tworzy nowy ActionListener
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(k);
            }
        });
        panel.add(jButton);
    }
}
