package ramka.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame {
    private JButton anuluj;
    private JPanel panel1;
    private JButton start;
    private JCheckBox checkBox1;
    private JTextField textField1;
    private JProgressBar progressBar1;

    public frame() {
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "startujemy");
            }
        });
        this.setVisible(true);
        this.setBounds(300, 300, 300, 200);
        this.setDefaultCloseOperation(3);
        this.setTitle("exampleFrame");
        this.setContentPane(panel1);

        anuluj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1.isSelected())
                JOptionPane.showMessageDialog(null, fivePlusFive());
                else JOptionPane.showMessageDialog(null, "please check the checkbox");
            }
        });
    }

    private int fivePlusFive() {
        return 5 + 5;
    }

    public static void main(String[] args) {
        frame frame = new frame();


    }
}
