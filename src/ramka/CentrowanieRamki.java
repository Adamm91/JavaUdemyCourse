package ramka;

import javax.swing.*;
import java.awt.*;

public class CentrowanieRamki extends JFrame {



    public CentrowanieRamki () {

        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;

        int frameWidth = width / 2;
        int frameHeight = height / 2;
        this.setSize(frameWidth, frameHeight);

        this.setLocation((width - frameWidth) / 2, (height - frameHeight) / 2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new CentrowanieRamki().setVisible(true); // tworze nowa ramke oraz ustawiam jej widocznosc
    }
}
