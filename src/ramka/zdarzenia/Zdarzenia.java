package ramka.zdarzenia;

import javax.swing.*;
import java.awt.*;

class Zdarzenia extends JFrame {

    // tworze panel oraz button
    JPanel panel = new JPanel();
    JButton redButton = new JButton("czerwony");
    JButton greenButton = new JButton("zielony");

    // tworze konstruktor ramki
    public Zdarzenia() {

        this.setBounds(300, 300, 300, 200);
        this.setTitle("Zdarzenia");
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        initComponents();
    }

    public static void main(String[] args) {
        Zdarzenia zdarzenia = new Zdarzenia();

    }

    // dodaje komponenty w oddzielnej metodzie
    private void initComponents() {
        this.getContentPane().add(panel); // dodaje panel do szkla
//        panel.add(redButton); // dodaje button do panelu
//        panel.add(greenButton); // dodaje button do panelu

//        redButton.addActionListener(new sluchachKolorow(Color.RED)); // dodaje sluchacza buttona i w konstruktorze podaje kolor
//        greenButton.addActionListener(new sluchachKolorow(Color.GREEN)); // dodaje sluchacza buttona i w konstruktorze podaje kolor
        createChangingBgColorButton("zolty", Color.YELLOW);
        createChangingBgColorButton("czerwony", Color.RED);
        createChangingBgColorButton("zielony", Color.GREEN);

    }
/*


//     tworze sluchacza
    private class sluchachKolorow implements ActionListener {
        Color kolor; // tworze pole koloru

         tworze konstruktor w ktorym podajemy kolor
        public sluchachKolorow(Color k) {
            this.kolor = k;// przypisuje kolorowi kolor z konstruktora
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(kolor); // przypisuje dla tla panelu kolor z konstruktora, ktory idzie z buttona
        }

    }
     */

    public void createChangingBgColorButton(String name, final Color k) {
        JButton jButton = new JButton(name);
        panel.add(jButton);
        jButton.addActionListener(e -> panel.setBackground(k));
    }
}
