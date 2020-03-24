package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht_2_1  extends Applet{

    public void init(){
        setBackground(Color.blue);
    }

    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.drawString("Gino",150, 150);
    }

}
