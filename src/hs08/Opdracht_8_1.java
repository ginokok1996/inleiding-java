package hs08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_8_1  extends Applet{
    TextField tekstvak;
    Button ok;
    Button reset;
    String antwoord;

    public void init(){
        tekstvak = new TextField("",20);
        ok = new Button("Ok");
        reset = new Button("Reset");
        ok.addActionListener(new oklistener());
        reset.addActionListener(new resetlistener());
        add(tekstvak);
        add(ok);
        add(reset);
    }

    public void paint(Graphics g){
        g.drawString(antwoord, 50,50);
    }

    class oklistener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            antwoord = tekstvak.getText();
            repaint();
        }
    }

    class resetlistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            antwoord = " ";
            repaint();
        }
    }

}