package hs10;

import javax.xml.soap.Text;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Beslissingen2  extends Applet{

    int leeftijd;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init(){
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new tekstvaklistener());
        tekst = "";

        label = new Label("Voer uw leeftijd en en druk op enter");

        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g){
        g.drawString(tekst, 50,50);
    }

    class tekstvaklistener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            // leeftijd = Integer.parseInt(textvak.getText()); is ook mogelijk.
            String s = tekstvak.getText();
            leeftijd = Integer.parseInt(s);
            if(leeftijd > 20){
                tekst = "U bent meerderjaardig.";
            } else {
                tekst = "U bent minderjarig";
            }
            repaint();
        }
    }

}
