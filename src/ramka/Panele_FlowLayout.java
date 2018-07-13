package ramka;

import javax.swing.*;
import java.awt.*;

public class Panele_FlowLayout extends JFrame {

    // tworze przyciski
    JButton button1 = new JButton("button 1");
    JButton button2 = new JButton("button 2");
    JButton button3 = new JButton("button 3");
    JButton button4 = new JButton("button 4");

    // tworze panel. Panele sluza do grupowania
    JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));


    public Panele_FlowLayout() {

        this.setDefaultCloseOperation(3);
        this.setBounds(300, 300, 300, 200);
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        // ustawiam preferowana wielkosc buttona 1
        button1.setPreferredSize(new Dimension(100, 100));
        // ustawiam preferowana wielkosc buttona 2
        button2.setPreferredSize(button2.getPreferredSize());

        // dodaje buttony do panelu
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);

        // dodaje panel do kontenera
        this.getContentPane().add(panel1, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        Panele_FlowLayout panele_flowLayout = new Panele_FlowLayout();
    }


}
