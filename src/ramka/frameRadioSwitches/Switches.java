package ramka.frameRadioSwitches;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Switches extends JFrame{
    private JPanel panel;
    private JRadioButton Mały;
    private JRadioButton Sredni;
    private JRadioButton Duzy;
    private JLabel Cos;

    ButtonGroup group = new ButtonGroup();

    public Switches() {
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.getContentPane().add(panel);
        this.pack();

        group.add(Mały);
        group.add(Sredni);
        group.add(Duzy);
        Sredni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cos.setFont(new Font("Monocos", Font.PLAIN,25));
            }
        });
        Mały.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cos.setFont(new Font("Monocos", Font.PLAIN, 15));
            }
        });
        Duzy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cos.setFont(new Font("Monocos", Font.PLAIN, 35));
            }
        });
    }

    public static void main(String[] args) {
        new Switches();
    }
}
