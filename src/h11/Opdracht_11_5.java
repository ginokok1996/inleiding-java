package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht_11_5  extends Applet{


    public void init(){
    }

    public void paint(Graphics g){

        for(int i = 20; i < 120; i += 20){
            g.drawRect(i, i, 20,20);
        }

    }


}

