package h06;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet{
    double cijferA, cijferB, cijferC, gemiddelde, afgerondGem;
    int converteren;


    public void init(){
        cijferA = 5.9;
        cijferB = 6.3;
        cijferC = 6.9;
        gemiddelde = (cijferA + cijferB + cijferC) / 3;
        gemiddelde *= 10;
        converteren = (int) gemiddelde;
        afgerondGem = converteren;
        afgerondGem /= 10;
    }

    public void paint(Graphics g){
        g.drawString("Het gemiddelde is: " + afgerondGem, 20, 20);
    }

}
