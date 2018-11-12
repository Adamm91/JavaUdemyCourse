package ramka.przeszukiwaczTekstu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrzeszukiwaczTekstu extends JFrame {

    private JTextArea obszarTekstowy = new JTextArea("to jest test i kolejny test",7, 2); // obszar tekstowy w ktorym juz na starcie jest cos napisane

    private JScrollPane obszarPrzewijania = new JScrollPane(obszarTekstowy); // panel do przesuwania (scrollowania) do ktorego dodaje obszar tekstowy

    private JPanel panelSzukania = new JPanel(); // panel szukania

    private JButton znajdz = new JButton("znajdz"); // przyciski znajdowania i zamieniania
    private JButton zamien = new JButton("zamien");

    private JTextField szukany = new JTextField(4); // pola tekstowe szukanego tekstu i na jaki go zamienic ktore maja szerokosc 4 kolumn
    private JTextField nowyTekst = new JTextField(4);

    private JLabel etykietaI = new JLabel("i"); // etykiety z napisem
    private JLabel etykietaNa = new JLabel("na");


    public PrzeszukiwaczTekstu() {
        super("Przeszukiwacz tekstu");
        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.setBounds(300, 300, 300, 200);

        // do panelu szukania dodaje przyciski, etykiety oraz pola tekstowe
        panelSzukania.add(znajdz);
        panelSzukania.add(szukany);
        panelSzukania.add(etykietaI);
        panelSzukania.add(zamien);
        panelSzukania.add(etykietaNa);
        panelSzukania.add(nowyTekst);

        // przypisuje przyciskom ActionListenery, ktore sa w oddzielnych metodach
        znajdz.addActionListener(new znajdowanieHandler());
        zamien.addActionListener(new zmienianieHandler());

        // dodaje obszar przewijania (w ktorym znajduje sie obszar tekstowy) oraz panel szukania do szkla
        this.getContentPane().add(obszarPrzewijania, BorderLayout.NORTH);
        this.getContentPane().add(panelSzukania, BorderLayout.CENTER);

// przykladowe funkcje :
//        obszarTekstowy.selectAll(); zaznacza wszystko
//        obszarTekstowy.select(0, 3); zaznacza od indeksu do indeksu
//        obszarTekstowy.replaceSelection("ich bin "); zamienia zaznaczone na podane
//        obszarTekstowy.replaceRange("dupa", 1, 2); zamienia od indeksu do indeksu na wpisany tekst
//        obszarTekstowy.insert("gowienko", 5); dodaje slowo w podanym miejscu
//        obszarTekstowy.append("gowienno"); dodaje slowo na koncu
    }

    public class znajdowanieHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // itn poczatek szukania to indeks zaraz za szukanym fragmentem, dzieki temu wyszukuje sie kolejny wyraz
            poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText(), poczatekSzukanego + szukany.getText().length());

            // dzieki zamianie -1 (czyli po skonczeniu wyszukawania) na nizej podane, wyszukujemy w kolko
            if (poczatekSzukanego == -1)
                poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText());

            // jesli poczatek szukania jest wiekszy niz 0 (a jest dzieki powyzszej funkcji) i tekst ktory chcemy wyszukac nie jest pusty to znajdziemy i zaznaczymy slowo
            // oraz skupimy uwage na obszarze tekstowym
            if (poczatekSzukanego >= 0 && szukany.getText().length() > 0) {
                obszarTekstowy.requestFocus();
                obszarTekstowy.select(poczatekSzukanego, poczatekSzukanego + szukany.getText().length());
            }
        }
        private int poczatekSzukanego = 0;
    }

    private class zmienianieHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // jesli jest cokolwiek zaznaczone
            if (obszarTekstowy.getSelectionStart() != obszarTekstowy.getSelectionEnd()) {
                // to zamieniamy tekst
            zamienTekst();
            } else { // jesli nie to
                znajdz.doClick(0); // wyszukujemy kolejnego wyrazu, z zaznaczeniem ze ma nie "klikac" wizualnie dlatego ustawione jest 0
                if (obszarTekstowy.getSelectionStart() != obszarTekstowy.getSelectionEnd()) // jesli zaznaczylo cokolwiek w powyzszym to zmieni tekst
                    zamienTekst();
            }
        }

        // wewnetrzna metoda ktora zamienia tekst
        public void zamienTekst () {
            // wyskakuje okno ktore pyta czy chcemy zmienic tekst. Najpierw rootPane, potem tekst ktory ma sie wyswietlic, potem tytul na gorze, na koncu jakie opcje mamy
            // calosc przypisujemy do int, zeby bylo latwo sprawdzic warunek
            int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy chcesz zamienic \"" + szukany.getText()
                    + "\" na \"" + nowyTekst.getText() + "\"", "Uwaga", JOptionPane.YES_NO_OPTION);
            // jesli wybierzemy "yes" to opcja bedzie rowna 0, czyli sprawdzi sie ponizszy warunek i zamieni tekst
            if (opcja == 0)
                // zamien (nowy tekst, od poczatku zaznaczenia do jego konca)
            obszarTekstowy.replaceRange(nowyTekst.getText(), obszarTekstowy.getSelectionStart(), obszarTekstowy.getSelectionEnd());
        }
    }

    public static void main(String[] args) {
        new PrzeszukiwaczTekstu();
    }

}
