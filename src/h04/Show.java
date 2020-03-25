package h04;

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 100);
        g.fillRect(20, 140, 100, 100);
        g.drawRoundRect(140, 20, 100, 100, 80, 80);
        g.fillRoundRect(140, 140, 100,100,80, 80);
        g.drawOval(260, 20, 100, 100);
        g.fillOval(260, 140, 100, 100);
        g.drawArc(380, 20, 100, 100, 0, 360);
        g.fillArc(380, 140, 100, 100, 90, 90);
    }
}