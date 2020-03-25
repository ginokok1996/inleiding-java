package hs08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tekstvak extends Applet {
    TextField tekstvak;
    Label label;
    String s;

    public void init() {
        tekstvak = new TextField("klik op mij", 20);
        label = new Label("typ iets in het textvakje");
        tekstvak.addActionListener( new Textvaklistener());
        add(label);
        add(tekstvak);
        s = "";

    }

    public void paint(Graphics g) {
        g.drawString(s, 50,50);
    }

    class Textvaklistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s = tekstvak.getText();
            repaint();
        }
    }

}
