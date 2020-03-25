package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht_6_2 extends Applet{
    int jaar, dag, uur, minuut;

    public void init(){
       minuut = 60;
       uur = 60 * 60;
       dag = uur * 24;
       jaar = dag * 365;
    }

    public void paint(Graphics g){
        g.drawString("Een uur duurt: " + uur + " seconden", 20, 20);
        g.drawString("Een dag duurt: " + dag + " seconden", 20,40);
        g.drawString("Een jaar duurt: " + jaar + " seconden", 20,60);
    }

}
