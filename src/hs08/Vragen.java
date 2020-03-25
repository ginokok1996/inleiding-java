package hs08;

import java.awt.*;
import java.applet.*;

public class Vragen  extends Applet{

    public void init(){
        setBackground(Color.white);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("1: Wat is event-handling?",10, 10);
        g.drawString("2: Wat is een gebruikersinterface?",10, 50);
        g.drawString("3: Waarom moet er voor een knop wel en voor een tekst geen event-handling geprogrammeerd worden?",10, 90);
        g.drawString("4: Wat is een lege string?",10, 130);
        g.drawString("5: Wat is het verschil tussen een tekstvak en een label?",10, 170);
        g.drawString("6: Waarom moeten getallen uit een tekstvak altijd geconverteerd worden naar een double of een int?",10, 210);


        g.setColor(Color.blue);
        g.drawString("Dat is als windows de methode roept die bijvoorbeeld bij een knop of tekstvak hoort.", 10, 30);
        g.drawString("Dat is wat er visueel te zien is in het programma. dus alle knoppen, werkbalken, menu's, pictorgrammen", 10, 70);
        g.drawString("Omdat bij een tekstveld alleen de standaardhandelingen gebruikt worden en die regelt windows intern.", 10, 110);
        g.drawString("dat is als je \"\" zet als de waarde van de string. zo kan je een string leeg laten of leeg maken.  ", 10, 150);
        g.drawString("In een tekstvak kan je tekst typen en een Label is een stuk tekst waar je niet in kan typen.", 10, 190);
        g.drawString("Als je een getal uit een tekstvak haalt dan krijg je die terug als een string en moet hij dus omgezet worden naar een int of double.", 10, 230);




    }

}