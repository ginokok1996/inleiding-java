package h11;

import java.awt.*;
import java.applet.*;



public class Opdracht_11_1 extends Applet{


    public void init(){

    }

    public void paint(Graphics g){
        int x = 20;

        for (int i = 0; i < 10; i++){
            x += 20;
            g.drawLine(x, 50, x, 300);

        }
    }


}
