package ramka;

import javax.swing.*;

public class Group_Layout extends JFrame {

    // tworze buttony
    JButton button1 = new JButton("button1");
    JButton button2 = new JButton("button2");
    JButton button3 = new JButton("button3");
    JButton button4 = new JButton("button4");
    JButton anuluj = new JButton("anuluj");

    // tworze domyslny konstruktor ktory zawiera podstawowe elementy ramki
    public Group_Layout() {

        this.setBounds(300, 300, 300, 200);

        this.setDefaultCloseOperation(3);

        this.initComponents(); // w konstruktorze wywolana jest metoda init

        this.setVisible(true);
    }


    // metoda init wywolywana podczas konstruktora domyslnego
    public void initComponents() {
        // tworze layout grupowy
        GroupLayout layout = new GroupLayout(getContentPane());

        // zmieniam layout kontener z domyslnego na utworzony
        this.getContentPane().setLayout(layout);

        // ustawiam poziome ustawienie buttonow na nastepujace:
        //          * * *
        //            *
        layout.setHorizontalGroup( // zmieniam ustawienie poziome
                layout.createSequentialGroup() // tworze nowa sekwencje buttonow
                        .addComponent(button1) // dodaje przycisk 1
                        .addGroup( // nastepnie tworze grupe przyciskow ktore sa pod soba
                                layout.createParallelGroup() // tworze podgrupe
                                        .addComponent(button2) // dodaje przyciski
                                        .addComponent(button4)
                        )
                        .addComponent(button3) // za grupa przyciskow dodaje ostatni przycisk
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addComponent(anuluj)
        );

        layout.setVerticalGroup( // zmieniam ustawienie pionowe
        layout.createSequentialGroup()
                .addGroup( // dodaje grupe 3 przyciskow
                layout.createParallelGroup()
                        .addComponent(button1)
                        .addComponent(button2)
                        .addComponent(button3)
                )
                .addComponent(button4) // na koncu dodaje jeden przycisk
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(anuluj)
        );

        layout.setAutoCreateContainerGaps(true); // ustawiam odstepy buttonow od krawedzi ramki
        layout.setAutoCreateGaps(true); // ustawiam odstepy miedzy buttonami
    }

    public static void main(String[] args) {
        Group_Layout group_layout = new Group_Layout();
    }
}
