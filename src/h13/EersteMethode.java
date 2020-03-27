package h13;

import java.awt.*;
import java.applet.*;



public class EersteMethode  extends Applet{

    double[] getallen = {5, 12, 24, 5, 8, 1};
    double gemiddelde;

    public void init(){
        gemiddelde = berekenGemiddelde(getallen);
    }

    public void paint(Graphics g){
        g.drawString("Het gemiddelde is: " + gemiddelde, 50,50);
    }

    double berekenGemiddelde(double[] a){
        double som = 0, gem = 0;

        for(int i = 0; i < a.length; i++){
            som += a[i];
        }
        gem = som / a.length;
        return gem;
    }

}
