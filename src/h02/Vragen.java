package h02;

import java.awt.*;
import java.applet.*;

public class Vragen  extends Applet{

    public void init(){
        setBackground(Color.white);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("1: Wat is machine taal?",10, 10);
        g.drawString("2: Welke drie hulpmiddelen heb je nodig om te programmeren?",10, 50);
        g.drawString("3: Hoe herken je opdrachten in de broncode?",10, 90);
        g.drawString("4: Waartoe dienen de import-opdrachten?",10, 130);
        g.drawString("5: Wat is een methode?",10, 170);

        g.setColor(Color.blue);
        g.drawString("Machine taal is de taal die de machine begrijpt. dit is een reeks van eenen en nullen ook wel binaire code genoemd.", 10, 30);
        g.drawString("Textverwerker, Compiler en een Linker.", 10, 70);
        g.drawString("een opdracht is een line code die je altijd met een puntkomma afsluit.", 10, 110);
        g.drawString("Die gebruik je om al bestaande classes op te halen zodat je deze kunt gebruiken in je project", 10, 150);
        g.drawString("Een methode is een stuk code die bestaat uit meerdere opdrachten.", 10, 190);
        g.drawString("Deze kan je ook meerdere keren in je class gebruiken als dit nodig is.", 10, 210);


    }

}
