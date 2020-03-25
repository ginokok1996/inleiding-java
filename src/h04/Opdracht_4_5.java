package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht_4_5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(200,200,200,200, 0, 360);
    }
}