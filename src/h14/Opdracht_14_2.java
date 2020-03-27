package h14;

import java.awt.*;
import java.applet.*;
import java.util.Random;


public class Opdracht_14_2  extends Applet{

    int index = 0;
    int y = 50;
    int x = 50;
    String kaart;
    String[] deck;
    String[] kleuren = {"Harten", "Schoppen", "Klaver", "Ruiten"};
    String[] kaarten = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "koning"};
    String[] speler1, speler2, speler3, speler4;

    public void init(){
        deck = new String[52];
        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];


        //hier word het deck gevuld met kaarten.
        for (int i = 0; i < kleuren.length; i++) {
            for (int j = 0; j < kaarten.length; j++) {
                kaart = kleuren[i] + " " + kaarten[j];
                deck[index] = kaart;
                index ++;
            }
        }

        //hier worden de speler arrays gevuld met kaarten.
        for (int i = 0; i < speler1.length; i++) {
            speler1[i] = deelKaart();
        }
        for (int i = 0; i < speler2.length; i++) {
            speler2[i] = deelKaart();
        }
        for (int i = 0; i < speler3.length; i++) {
            speler3[i] = deelKaart();
        }
        for (int i = 0; i < speler4.length; i++) {
            speler4[i] = deelKaart();
        }
    }

    public void paint(Graphics g){
        y = 50;
        x = 50;

        g.drawString("Speler 1", x, y - 20);
        for (int i = 0; i < speler1.length ; i++) {
            g.drawString(speler1[i], x, y);
            y += 20;
        }
        x += 150;
        y = 50;

        g.drawString("Speler 2", x, y - 20);
        for (int i = 0; i < speler2.length ; i++) {
            g.drawString(speler2[i], x, y);
            y += 20;
        }
        x += 150;
        y = 50;

        g.drawString("Speler 3", x, y - 20);
        for (int i = 0; i < speler3.length ; i++) {
            g.drawString(speler3[i], x, y);
            y += 20;
        }
        x += 150;
        y = 50;

        g.drawString("Speler 4", x, y - 20);
        for (int i = 0; i < speler4.length ; i++) {
            g.drawString(speler4[i], x, y);
            y += 20;
        }
    }


    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[deck.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        deck = hulpLijst;
        //de methode geeft de random kaart terug
        return kaart;
    }

}
