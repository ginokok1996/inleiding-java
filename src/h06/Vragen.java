package h06;

import java.awt.*;
import java.applet.*;

public class Vragen extends Applet{

    public void init(){
        setBackground(Color.white);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("1: Waarom is initialiseren van variabelen noodzakelijk?",10, 10);
        g.drawString("2: Waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?",10, 50);
        g.drawString("3: Wat is de uitvoer van dit programma? Geef een verklaring.",10, 90);
        g.drawString("4: In de regel uitkomst = (a + b) / c; laat je de ronde haken weg. De regel ziet er dan als volgt uit",10, 130);
        g.drawString("5: Wat is de uitvoer van dit programma? Geef een verklaring.",10, 170);

        g.setColor(Color.blue);
        g.drawString("anders weet je niet welke waarde in het variabele staat. Dit hoeft niet per se 0 te zijn.", 10, 30);
        g.drawString("Omdat een int een heel nummer moet zijn en met typecasting convert je de double zodat deze geen cijfers achter het decimaal meer heeft.", 10, 70);
        g.drawString("De uitkomst van dit programma is: 5.333333333333333. a, b en c zijn ints maar de uitkomst is een double.", 10, 110);
        g.drawString("Zie antwoord bij vraag 5.", 10, 150);
        g.drawString("De uitkomst van dit programma is: 5.66666666667. omdat de haken weggehaald zijn heeft het delen voorrang.", 10, 190);
        g.drawString("En krijg je dus b / c + a (dus komt er eigenlijk te staan 8 / 3 + 3) en dan kom je op 5.66666666667 uit.", 10, 210);


    }

}
