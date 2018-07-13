package ramka;

import javax.swing.*;
import java.awt.*;

public class UkladyKomponentySzybka extends JFrame {

    public UkladyKomponentySzybka () {
        // ustawiam tytul ramki
        super("uklad graficzny (Layout)");

        // ustawiam granice ramki oraz jej polozenie
        this.setBounds(300, 320, 300, 200);

        this.setLayout(null); // ustawiam brak ukladu graficznego, przez co wszystko musze ustawiac recznie
        initComponents(this); // uzycie metody

        this.setDefaultCloseOperation(3); // zamykanie aplikacji po zamknieciu ramki
    }

    public void initComponents (JFrame ramka) { // dodawanie komponentow (np. przyciskow)
        // dodaje kilka przyciskow
        JButton centrum = new JButton("centrum");
        JButton gora = new JButton("gora");
        JButton dol = new JButton("dol");
        JButton prawa = new JButton("prawa");
        JButton lewa = new JButton("lewa");

        // pobieram kontener ramki
        Container kontener = this.getContentPane();

        // ustawiam rozmiar przyciskow na preferowany
        centrum.setSize(centrum.getPreferredSize());
        gora.setSize(gora.getPreferredSize());
        dol.setSize(dol.getPreferredSize());
        prawa.setSize(prawa.getPreferredSize());
        lewa.setSize(lewa.getPreferredSize());

        // zmieniam lokalizacje przyciskow recznie metoda prob i bledow
//        centrum.setLocation(220, 135);
//        gora.setLocation(140, 20);
//        dol.setLocation(140, 135);
//        lewa.setLocation(20, 80);
//        prawa.setLocation(220, 80);

        // centruje lokalizacje przyciskow
        centrum.setLocation((ramka.getSize().width - centrum.getSize().width) / 2,
                (ramka.getSize().height - centrum.getSize().height) / 2);

        gora.setLocation((ramka.getSize().width - gora.getSize().width) / 2, 20);

        dol.setLocation((ramka.getSize().width - dol.getSize().width) / 2,
                ramka.getSize().height - dol.getSize().height - 20);

        lewa.setLocation(20, (ramka.getSize().height - lewa.getSize().height) / 2);

        prawa.setLocation(ramka.getSize().width - prawa.getSize().width - 20,
                (ramka.getSize().height - prawa.getSize().height) / 2);

        // ustawianie automatyczne gdy mam wlaczony Default'owy Layout
//        kontener.add(centrum, BorderLayout.CENTER);
//        kontener.add(gora, BorderLayout.PAGE_START);
//        kontener.add(dol, BorderLayout.PAGE_END);
//        kontener.add(prawa, BorderLayout.LINE_END);
//        kontener.add(lewa, BorderLayout.LINE_START);

        // dodaje przyciski do kontenera
        kontener.add(centrum);
        kontener.add(gora);
        kontener.add(dol);
        kontener.add(prawa);
        kontener.add(lewa);
    }

    public static void main(String[] args) {

        new UkladyKomponentySzybka().setVisible(true);
    }

}
