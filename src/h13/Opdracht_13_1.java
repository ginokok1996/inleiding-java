package h13;

import java.awt.*;
import java.applet.*;



public class Opdracht_13_1  extends Applet{


    public void init(){

    }

    public void paint(Graphics g){
        int x1 = 200;
        int y1 = 50;
        int x2 = 300;
        int y2 = 300;
        int x3 = 100;
        int y3 = 300;


        tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
    }

    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }

}