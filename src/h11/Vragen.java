package h11;

import java.awt.*;
import java.applet.*;

public class Vragen  extends Applet{

    public void init(){
        setBackground(Color.white);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("1: Wat is het verschil tussen een while- en een for-lus?",10, 10);
        g.drawString("2: Wat is het nesten van lussen?",10, 50);
        g.drawString("3:Bekijk de volgende broncode, wordt de lus uitgevoerd? Geef een verklaring voor je antwoord",10, 90);

        g.setColor(Color.blue);
        g.drawString("In een for Loop word de variabele automatisch gewijzigd en bij een while loop moet de programmeur daar zelf op letten.", 10, 30);
        g.drawString("Dat is als je een loop in een loop stopt.", 10, 70);
        g.drawString("Nee, de loop werkt als i kleiner is dan eind. en i staat gelijk aan 10 en eind gelijk aan 5 en is hij dus niet kleiner.", 10, 110);
    }

}