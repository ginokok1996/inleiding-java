package h11;

import java.awt.*;
import java.applet.*;



public class Opdracht_11_2  extends Applet{


    public void init(){

    }

    public void paint(Graphics g){
        int getal = 10;

        for(int i = 20; i < 240; i += 20){
            g.drawString("" +getal, i, 50);
            getal +=1;
        }
    }


}
