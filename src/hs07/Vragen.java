package hs07;

import java.awt.*;
import java.applet.*;

public class Vragen extends Applet{

    public void init(){
        setBackground(Color.white);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("1: Kun je in de Java API (zie web-links) deze methode ergens vinden?",10, 10);
        g.drawString("2: In welke klasse wordt deze methode gedefinieerd?",10, 50);
        g.drawString("3: Dezelfde klasse heeft een tweede methode met dezelfde naam. Wat is het verschil?",10, 90);

        g.setColor(Color.blue);
        g.drawString("Yes gevonden in de lijst van Method Summary", 10, 30);
        g.drawString("public void setSize(int width, int height)", 10, 70);
        g.drawString("Een gebruikt in de arguments de class Dimension en bij de ander moet je 2 ints voor de width en height invullen.", 10, 110);

    }

}