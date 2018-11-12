package ramka.checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox extends JFrame {

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel label = new JLabel("Jestem cool");

    JCheckBox pogrubiony = new JCheckBox("Pogrubiony");
    JCheckBox pochylony = new JCheckBox("Pochylony");

    public Checkbox() {
        super("Checkbox");
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        initComponents();

    }

    private void initComponents() {
        this.setBounds(300, 300, 300, 200);
        this.getContentPane().add(panel1, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.CENTER);

        ActionListener checkboxHandler = new CheckboxHandler();

        pogrubiony.addActionListener(checkboxHandler);
        pochylony.addActionListener(checkboxHandler);

        label.setFont(new Font("Monospaced", 0, 20));

        panel1.add(pogrubiony);
        panel1.add(pochylony);

        panel2.add(label);


    }

    public class CheckboxHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int style = Font.PLAIN;
            if (pogrubiony.isSelected()) style += 1;
            if (pochylony.isSelected()) style += 2;
            label.setFont(new Font(label.getFont().getFamily(), style, label.getFont().getSize()));
        }
    }

    public static void main(String[] args) {
        new Checkbox();
    }
}
