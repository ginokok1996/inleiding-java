package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht_4_7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(200,200, 200, 200);
        g.fillOval(220,220, 60,60);
        g.fillOval(220,320, 60,60);
        g.fillOval(320,220, 60,60);
        g.fillOval(320,320, 60,60);

    }
}
