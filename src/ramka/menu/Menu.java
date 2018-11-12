package ramka.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

    private JPanel panel = new JPanel();
    private MenuButton menu1 = new MenuButton("1. Dodaj"); // tworze przyciski z klasy MenuButton
    private MenuButton menu2 = new MenuButton("2. Usun");
    private MenuButton menu3 = new MenuButton("3. Zmien");
    int i = 0;


    public Menu() { // konstruktor
        super("Menu"); // nazwa ramki
        initComponents(); // wczytuje komponenty
    }

    private void initComponents() { // metoda w ktorej zawarte sa komponenty
        this.setBounds(300, 300, 300, 200);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.getContentPane().add(panel);

        panel.setLayout(new GridLayout(3, 1)); // zmieniam layout ktory ma 3 rzedy i jedna kolumne

        panel.add(menu1); // dodaje przyciski do panelu
        panel.add(menu2);
        panel.add(menu3);
    }

    private class MenuButton extends JButton implements FocusListener, ActionListener { // tworze klase do tworzenia przyciskow

        Color defaultColor = Color.BLUE; // przypisuje stale kolory zeby zmieniac je w prosty sposob zamiast w kazdym miejscu oddzielnie
        Color selectedColor = Color.RED;

        public MenuButton(String name) { // konstruktor ktory potrzebuje nazwy przycisku
            super(name);
            this.setForeground(defaultColor); // domyslnie przycisk jest niebieski
            this.addFocusListener(this); // dodaje sluchacza skupienia na obiekcie (przycisku)
            this.addKeyListener(new KeyAdapter() { // dodaje sluchacza klawiatury
                @Override
                public void keyPressed(KeyEvent e) {
                    keyPressedHandler(e); // odwolanie do metody
                }
            });
            this.addActionListener(this); // dodaje actionlistenera ktory jest w tym obiekcie, dlatego this
        }

        @Override
        public void focusGained(FocusEvent e) { // jesli skupiony na klawiszu to zmiana koloru na podany
            this.setForeground(selectedColor);
        }

        @Override
        public void focusLost(FocusEvent e) { // jesli przestaje byc skupiony na klawiszu to zmiana koloru na podany
            this.setForeground(defaultColor);
        }

        private void keyPressedHandler(KeyEvent e) { // metoda ktora obslucuje klikniety przycisk na klawiaturze

            int menuSize = panel.getComponentCount(); // wczytuje ilosc komponentow panulu (ilosc buttonow)
            if (i == 0 || i == 6) i = menuSize; // unikam zejscia ponizej zera, zeby nie wyskoczyl blad oraz powyzej jakiejsc wartosci, zeby nie wyjsc za zakres
            if (e.getKeyCode() == KeyEvent.VK_DOWN) panel.getComponent(++i % menuSize).requestFocus(); // jesli przycisk to "strzalka w dol" to skupiam sie na komponencie z panelu o numerze powiekszonego i modulo przez ilosc komponentow
            else if (e.getKeyCode() == KeyEvent.VK_UP) panel.getComponent(--i % menuSize).requestFocus();
            else if (e.getKeyCode() == KeyEvent.VK_ENTER) ((MenuButton) e.getSource()).doClick(); // rzutuje zrodlo na button, nastepnie wykonuje klikniecie, czyli wywoluje akcje
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(this, ((MenuButton)e.getSource()).getText());
            // z JOptionPane wykonuje metody pokazania wiadomosci w innym oknie, jako parametr przekazuje TEN przycisk, nastepnie wyswietl jego tekst
        }
    }


    public static void main(String[] args) {
        new Menu();
    }
}
