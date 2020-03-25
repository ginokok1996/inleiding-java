package h04;


import java.awt.*;
import java.applet.*;

public class Opdracht_4_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(100,100,5,400);
        g.drawRect(105, 100, 250, 60);
        g.setColor(Color.red);
        g.fillRect(106,101,249,59);
        g.setColor(Color.black);
        g.drawRect(105,160, 250,60);
        g.drawRect(105,220, 250,60);
        g.setColor(Color.blue);
        g.fillRect(106, 221, 249, 59);
    }
}