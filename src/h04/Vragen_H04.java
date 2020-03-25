package h04;

import java.awt.*;
import java.applet.*;

public class Vragen_H04  extends Applet{

    public void init(){
        setBackground(Color.white);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("1: Wat is een platform?",10, 10);
        g.drawString("2: Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?",10, 50);
        g.drawString("3: Wat is bytecode?",10, 90);
        g.drawString("4: Wat doet JVM?",10, 130);
        g.drawString("5: Met welke methode kun je een vierkant tekenen?",10, 170);
        g.drawString("6: Noem drie methodes waarmee je een cirkel kunt tekenen",10, 210);
        g.drawString("7: Waarom worden opdrachten voor het scherm in paint() gezet en niet in een andere methode?",10, 290);

        g.setColor(Color.blue);
        g.drawString("Dat is de combinatie van een processor en een bestuuringssysteem", 10, 30);
        g.drawString("Omdat de JVM de bytecode vertaald naar machinetaal voor het betreffende platform", 10, 70);
        g.drawString("Is een tussentaal die de JVM kan omzetten naar de benodigde computertaal.", 10, 110);
        g.drawString("De Java Virtual Machine zet de tussentaal (bytecode) om naar de computertaal die het betreffende platform gebruikt", 10, 150);
        g.drawString("g.drawRect(x, y, width, height); bijvoorbeeld: g.drawRect(50, 50, 100, 100);", 10, 190);
        g.drawString("g.drawRoundRect(x, y, width, height, arcWidth, arcHeight); bijvoorbeeld: g.drawRoundRect(50, 50, 100, 100, 110, 110);", 10, 230);
        g.drawString("g.drawOval(x, y, width, height); bijvoorbeeld: g.drawOval(50, 50, 100, 100);", 10, 250);
        g.drawString("g.drawArc(x, y, width, height, startAngle, Arcangle); bijvoorbeeld: g.drawArc(50, 50, 100, 100, 0, 360);", 10, 270);
        g.drawString("Omdat dit de methode is die regelt wat er visueel moet gebeuren.", 10, 310);



    }

}