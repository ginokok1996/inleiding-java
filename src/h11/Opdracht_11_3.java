package h11;

import java.awt.*;
import java.applet.*;



public class Opdracht_11_3  extends Applet{


    public void init(){

    }

    public void paint(Graphics g){
        int getal1 = 1, getal2 = 0, getal3;

        for(int i = 20; i < 420; i += 20){
            getal3 = getal1 + getal2;
            g.drawString("" + getal3, 50, i);
            getal1 = getal2;
            getal2 = getal3;
        }
    }


}