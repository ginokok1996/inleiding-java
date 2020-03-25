package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht_6_1 extends Applet{
    double verdiend, verdeeld;
    
    public void init(){
        verdiend = 113;
        verdeeld = verdiend / 4;
    }

    public void paint(Graphics g){
        g.drawString("Jan krijgt: " + verdeeld + " euro", 30,30);
        g.drawString("Ali krijgt: " + verdeeld + " euro", 30,50);
        g.drawString("Jeanette krijgt: " + verdeeld + " euro", 30,70);
        g.drawString("Gino krijgt: " + verdeeld + " euro", 30,90);
    }

}
