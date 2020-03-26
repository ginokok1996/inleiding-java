package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_11_4  extends Applet {


    public void init(){

    }

    public void paint(Graphics g){
        int som, y = 20;

        //Kies hier welke tafel je wilt laten zien.
        int tafel = 3;

        for(int i = 1; i < 11; i ++){

            som = tafel * i;
            g.drawString("" + som, 50, y);
            y += 20;
        }
    }


}
