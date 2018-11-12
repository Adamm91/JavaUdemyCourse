package ramka.poleTekstowe;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class PoleTekstowe extends JFrame{
    private JTextField textField1;
    private JPanel panel1;

    public PoleTekstowe() {
        super("Pola tekstowe");
        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(3);
        this.setBounds(300, 300, 300, 300);
        this.setVisible(true);
        this.getContentPane().add(panel1);


        textField1.addKeyListener(new KeyAdapter() { // dodaje sluchacza przyciskow ktore sa juz "wydrukowane"
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!isNumber(e.getKeyChar())) e.consume(); // jesli przycisk nie jest liczba to go skonsumuje (usunie)
            }
        });

        textField1.addKeyListener(new KeyAdapter() { // dodaje sluchacza przyciskow ktore sa wciskane
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if ((e.isControlDown() || e.isMetaDown()) && e.getKeyCode() == KeyEvent.VK_V) { // jesli wcisniety ctrl (lub Meta w mac'u) i wciskane V (ctrl + v)
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); // przypisuje schowek systemowy do zmiennej clipboard
                    DataFlavor dataFlavor = DataFlavor.stringFlavor;
                    String schowek = ""; // tworze schowek systemowy jako string
                    try {
                        schowek = "" + clipboard.getData(dataFlavor); // probuje przypisac schowek do stringa (bo moze byc obrazek albo cos i wyskoczy wyjatek)
                    } catch (UnsupportedFlavorException e1) { // dodaje wyjatki
                        System.out.println("to nie string");
                    } catch (IOException e1) {
                        System.out.println("wystapil blad na wyjsciu");
                    }

                    for (int i = 0; i < schowek.length(); i++) // jesli udalo sie przypisac schowek do stringa to przechodze pokolei po jego kazdym znaku
                        if (!isNumber(schowek.charAt(i))) { // sprawdzam czy znak nie jest liczba
                            e.consume(); // usuwam tekst ktory probuje wkleic (ctrl + v) jesli jest w nim inny znak niz cyfra (0 - 9)
                            break; // wychodze z petli bo nie ma sensu dalej sprawdzac skoro jest w nim cos poza liczba
                        }
                }
            }
        });

    }

    private boolean isNumber (char c) { // metoda sprawdzajaca czy znak jest cyfra
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        new PoleTekstowe();
    }
}
