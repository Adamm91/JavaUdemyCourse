package ramka.przelacznik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    JLabel etykieta = new JLabel("cos");

    ButtonGroup group = new ButtonGroup();
    ButtonGroup groupColor = new ButtonGroup();


    public Main() {
        super("przelacznik");
        this.setDefaultCloseOperation(3);
        this.setBounds(300, 300, 300, 200);
        this.setVisible(true);
        initComponents();
    }

    private void initComponents() {
        createJRadioButtonSize("Maly", 15);
        createJRadioButtonSize("Sredni", 25);
        createJRadioButtonSize("Duzy", 35);

        createJRadioButtonColor("Zielony", Color.GREEN);
        createJRadioButtonColor("Czerwony", Color.RED);
        createJRadioButtonColor("Niebieski", Color.BLUE);

        panel2.add(etykieta);

        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.getContentPane().add(panel3, BorderLayout.CENTER);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);

    }

    public void createJRadioButtonSize (String nazwa, int size) {
        JRadioButton jRadioButton = new JRadioButton(nazwa);
        jRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etykieta.setFont(new Font("Monospaced", Font.PLAIN, size));
            }
        });
        group.add(jRadioButton);
        panel.add(jRadioButton);
    }

    public void createJRadioButtonColor (String nazwa, Color color) {
        JRadioButton jRadioButton = new JRadioButton(nazwa);
        jRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etykieta.setForeground(color);
            }
        });
        groupColor.add(jRadioButton);
        panel3.add(jRadioButton);
    }



    public static void main(String[] args) {
        new Main();
    }
}
