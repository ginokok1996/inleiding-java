package h11;

import java.awt.*;
import java.applet.*;



public class For  extends Applet{


    public void init(){

    }

    public void paint(Graphics g){

        int y = 0;

        for(int teller = 0; teller < 10; teller++){
         y += 20;
         g.drawLine(50, y, 300, y);
         g.drawString("" + teller, 305, y);
        }
    }


}

