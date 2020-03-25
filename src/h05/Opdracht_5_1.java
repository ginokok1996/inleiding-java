package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_5_1 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int cirkel;


    public void init() {
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 290;
        hoogte = 150;
        cirkel = 150;

    }

    public void paint(Graphics g) {
        g.setColor(opvulkleur);
        //gevulde rechthoek met ovaal
        g.fillRect(320,60, breedte, hoogte);

        //gevulde ovaal
        g.fillOval(320,250, breedte, hoogte);

        //taartpunt met ovaal eromheen
        g.fillArc(630,60, breedte, hoogte, 0, 45);

        g.setColor(lijnkleur);
        //lijn
        g.drawLine(10,20,300,20);

        //rechthoek
        g.drawRect(10,60, breedte, hoogte);

        //afgeronde rechthoek
        g.drawRoundRect(10, 250, breedte, hoogte, 30,30);

        //gevulde rechthoek met ovaal
        g.drawOval(320,60, breedte, hoogte);

        //taartpunt met ovaal eromheen
        g.drawOval(630,60, breedte, hoogte);

        //circel
        g.drawOval(700,250, cirkel, cirkel);



        g.drawString("Lijn", 150, 40);
        g.drawString("Rechthoek", 130, 230);
        g.drawString("Afgeronde rechthoek",100, 420);
        g.drawString("Gevulde rechthoek met ovaal", 380, 230);
        g.drawString("Taartpunt met ovaal eromheen", 700, 230);
        g.drawString("Gevulde ovaal",420, 420);
        g.drawString("circel",760, 420);




    }
}