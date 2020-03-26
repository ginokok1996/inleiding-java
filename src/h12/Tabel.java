package h12;

import java.awt.*;
import java.applet.*;

public class Tabel extends Applet  {
    double[] salaris;
    double[] kopie;

    public void init() {
        salaris = new double[5];
        kopie = new double[5];

        for (int i = 0; i < salaris.length; i ++) {
            salaris[i] = 100 * i + 100;
        }
        for (int i = 0; i < salaris.length; i ++) {
            kopie[i] = salaris[i];
        }
        kopie[3] = 1000;  //salaris[3] wordt nu niet gewijzigd!
    }

    public void paint(Graphics g) {
        for (int i = 0; i < salaris.length; i ++) {
            g.drawString("" + kopie[i], 50, 20 * i + 20);
            g.drawString("" + salaris[i], 100, 20 * i + 20);
        }
    }
}