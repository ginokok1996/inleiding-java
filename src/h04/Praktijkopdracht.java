package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        //gevulde rechthoek met ovaal
        g.fillRect(320,60, 290, 150);

        //gevulde ovaal
        g.fillOval(320,250, 290, 150);

        //taartpunt met ovaal eromheen
        g.fillArc(630,60, 290, 150, 0, 45);

        g.setColor(Color.black);
        //lijn
        g.drawLine(10,20,300,20);

        //rechthoek
        g.drawRect(10,60, 290, 150);

        //afgeronde rechthoek
        g.drawRoundRect(10, 250, 290, 150, 30,30);

        //gevulde rechthoek met ovaal
        g.drawOval(320,60, 290, 150);

        //taartpunt met ovaal eromheen
        g.drawOval(630,60, 290, 150);

        //circel
        g.drawOval(700,250, 150, 150);



        g.drawString("Lijn", 150, 40);
        g.drawString("Rechthoek", 130, 230);
        g.drawString("Afgeronde rechthoek",100, 420);
        g.drawString("Gevulde rechthoek met ovaal", 380, 230);
        g.drawString("Taartpunt met ovaal eromheen", 700, 230);
        g.drawString("Gevulde ovaal",420, 420);
        g.drawString("circel",760, 420);




    }
}
