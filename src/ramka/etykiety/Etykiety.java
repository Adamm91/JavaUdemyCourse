package ramka.etykiety;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Etykiety extends JFrame {

    public static void main(String[] args) {
        new Etykiety();
    }

    JPanel panel = new JPanel();
    JLabel label = new JLabel("czas:");
    JLabel czas = new JLabel();

    public Etykiety() {
        super("Etykiety");
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.setBounds(300, 200, 600, 400);
        initComponents();
    }

    private void initComponents() {
        this.getContentPane().add(panel);

        ActionListener zegar = new Zegar();

        Timer stoper = new Timer(1000, zegar);

        stoper.start();

        panel.add(label);
        panel.add(czas);

    }

    private class Zegar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            czas.setText(pobierzCzas());
        }
    }

    private String pobierzCzas() {
        GregorianCalendar kalendarz = new GregorianCalendar();
        String h = "" + kalendarz.get(Calendar.HOUR);
        String min = "" + kalendarz.get(Calendar.MINUTE);
        String sec = "" + kalendarz.get(Calendar.SECOND);

        if (Integer.parseInt(h) < 10) h = "0" + h;
        if (Integer.parseInt(min) < 10) min = "0" + min;
        if (Integer.parseInt(sec) < 10) sec = "0" + sec;

        return h + ":" + min + ":" + sec;
    }
}
