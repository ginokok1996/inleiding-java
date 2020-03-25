package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht_6_3 extends Applet{
    int a, b, totaal;

    public void init(){
         a = 2147483647;
         b = 25;
         totaal = a + b;
    }

    public void paint(Graphics g){
        g.drawString("" + totaal, 20, 20);
    }

}
