package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht_11_6  extends Applet{


    public void init(){
    }

    public void paint(Graphics g){
        int plaats = 50;
        for(int i = 100; i >= 20; i -= 20){

            g.drawOval(plaats, plaats, i, i);
            plaats += 10;
        }

    }


}