package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht_4_6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.fillRect(200,200, 100, 300);
        g.setColor(Color.red);
        g.fillOval(215,215,70,70);
        g.setColor(Color.orange);
        g.fillOval(215,315, 70, 70);
        g.setColor(Color.green);
        g.fillOval(215,415, 70, 70);
    }
}
