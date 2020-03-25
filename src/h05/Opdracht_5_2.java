package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht_5_2 extends Applet {
    int valerie;
    int jeroen;
    int hans;

    public void init() {
        valerie = 40 * 2;
        jeroen = 100 * 2;
        hans = 80 * 2;
    }

    public void paint(Graphics g) {
        g.drawString("  0", 20, 400);
        g.drawString(" 20", 20, 360);
        g.drawString(" 40", 20, 320);
        g.drawString(" 60", 20, 280);
        g.drawString(" 80", 20, 240);
        g.drawString("100", 20, 200);
        g.drawString("120", 20, 160);
        g.drawString("Valerie", 80, 420);
        g.drawString("Jeroen", 180, 420);
        g.drawString("Hans", 280, 420);

        g.setColor(Color.lightGray);
        g.drawLine(60,395, 350, 395);
        g.drawLine(60,355, 350, 355);
        g.drawLine(60,315, 350, 315);
        g.drawLine(60,275, 350, 275);
        g.drawLine(60,235, 350, 235);
        g.drawLine(60,195, 350, 195);
        g.drawLine(60,155, 350, 155);

        g.setColor(Color.blue);
        g.fillRect(80, 315, 40, valerie);
        g.setColor(Color.green);
        g.fillRect(180, 195, 40, jeroen);
        g.setColor(Color.red);
        g.fillRect(280, 235, 40, hans);
    }
}
