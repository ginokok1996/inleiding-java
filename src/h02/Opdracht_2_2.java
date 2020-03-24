package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht_2_2  extends Applet{

    public void init(){
        setBackground(Color.white);
    }

    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawString("Gino",150, 150);

        g.setColor(Color.red);
        g.drawString("Kok", 180, 150);
    }

}
