package hs08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_8_2  extends Applet{
    Button man, vrouw, lman, lvrouw;
    int tman, tvrouw, tlman, tlvrouw, totaal;

    public void init(){
        man = new Button("man");
        man.addActionListener(new manhandler());
        vrouw = new Button("vrouw");
        vrouw.addActionListener(new vrouwhandler());
        lman = new Button("Leerling mannelijk");
        lman.addActionListener(new lmanhandler());
        lvrouw = new Button("Leerling vrouwelijk");
        lvrouw.addActionListener(new lvrouwhandler());
        add(man);
        add(vrouw);
        add(lman);
        add(lvrouw);
    }

    public void paint(Graphics g){
        g.drawString(""+ tman, 50,50);
        g.drawString(""+ tvrouw, 100,50);
        g.drawString(""+ tlman, 180,50);
        g.drawString(""+ tlvrouw, 300,50);
        g.drawString("Totaal: "+ totaal, 170,150);
    }

    class manhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tman ++;
            totaal = tman + tvrouw + tlman + tlvrouw;
            repaint();
        }
    }

    class vrouwhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tvrouw ++;
            totaal = tman + tvrouw + tlman + tlvrouw;
            repaint();
        }
    }

    class lmanhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tlman ++;
            totaal = tman + tvrouw + tlman + tlvrouw;
            repaint();
        }
    }

    class lvrouwhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tlvrouw ++;
            totaal = tman + tvrouw + tlman + tlvrouw;
            repaint();
        }
    }

}
