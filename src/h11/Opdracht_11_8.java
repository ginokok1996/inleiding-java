package h11;

import java.awt.*;
import java.applet.*;



public class Opdracht_11_8  extends Applet{


    public void init(){
    }

    public void paint(Graphics g){
        for(int i = 500; i >= 10; i -= 10){
            g.drawOval(50, 50, i, i);

        }

    }


}