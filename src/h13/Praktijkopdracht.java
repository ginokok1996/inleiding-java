package h13;

import java.awt.*;
import java.applet.*;



public class Praktijkopdracht  extends Applet{

    int bladeren, hoogteboom, breedteboom, x, y, aantalbomen, rijen;

    public void init(){

    }

    public void paint(Graphics g){

        //afmetingen van de boom
        bladeren = 100;
        hoogteboom = 80;
        breedteboom = 10;
        x = 50;
        y = 50;
        aantalbomen = 5;
        rijen = 2;

        boomgaarde(g, aantalbomen, rijen);
    }

    public void boomgaarde(Graphics g, int aantalbomen, int rijen){
        for (int i = 0; i < rijen ; i++) {
            x = 50;
            for (int j = 0; j < aantalbomen ; j++) {
                tekenBoom(g, x, y, bladeren, hoogteboom, breedteboom);
                x += bladeren + 5;
            }
            y += bladeren + hoogteboom + 5;
        }
    }

    public void tekenBoom(Graphics g, int x, int y, int bladeren, int hoogteboom, int breedteboom){
        g.setColor(Color.green);
        g.fillOval(x,y, bladeren, bladeren);
        g.setColor(Color.black);
        g.fillRect(x + bladeren / 2 - (breedteboom / 2), y + bladeren, breedteboom, hoogteboom);
    }

}

