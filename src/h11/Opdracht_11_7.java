package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht_11_7  extends Applet{


    public void init(){
    }

    public void paint(Graphics g){
        int plaats = 200;
        for(int i = 500; i >= 10; i -= 10){

            g.drawOval(plaats, plaats, i, i);
            plaats += 5;
        }

    }


}