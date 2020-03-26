package h11;

import java.awt.*;
import java.applet.*;



public class Opdracht_11_9  extends Applet{


    public void init(){

    }

    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        int hoogte = 20;
        int breedte = 20;

        for(int i = 0; i < 4; i++) {
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom % 2 == 0) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }

            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom % 2 == 0) {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }

            x = 50;
            y += hoogte;
        }
    }

}
