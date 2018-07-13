package ramka;

import javax.swing.*;
import java.awt.*;

public class Ramka2 extends JFrame {

    public Ramka2(){
        this.setBounds(300, 200, 1000, 1000);
        this.setDefaultCloseOperation(3);
        this.setTitle("gowno");
//        this.pack(); sprawia ze ramka sie "pakuje" do odpowiednich rozmiarow - nie dziala tutaj (na linuxie)
    }

    public static void main(String[] args) {
        Ramka2 ramka2 = new Ramka2();
        ramka2.setVisible(true);
    }
}
