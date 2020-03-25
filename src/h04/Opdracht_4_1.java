package h04;


import java.awt.*;
        import java.applet.*;

public class Opdracht_4_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(200,200, 400, 200);
        g.drawLine(200, 200, 300, 20);
        g.drawLine(400, 200, 300, 20);
    }
}