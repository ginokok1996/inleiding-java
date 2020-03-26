package h12;

import java.awt.*;
import java.applet.*;



public class Opdracht_12_1  extends Applet{

    double[] cijfers = {5, 7, 6, 4, 9, 6, 8, 10, 6, 7};
    double totaal = 0;
    double gemiddelde;


    public void init(){
        for(int i = 0; i < cijfers.length; i++){
            totaal = totaal + cijfers[i];
        }
        gemiddelde = totaal / cijfers.length;
    }

    public void paint(Graphics g){
        for(int i = 0; i < cijfers.length; i++){
            g.drawString(""+ cijfers[i], 50, 20 * i + 20);
        }

        g.drawString("Het gemiddelde is: " + gemiddelde, 100, 20);
    }


}
