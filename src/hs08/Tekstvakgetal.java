package hs08;

import javax.swing.text.LabelView;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tekstvakgetal extends Applet{
    TextField tekstvak;
    Label label;
    double getal;

    public void init(){
        tekstvak = new TextField("",20);
        label = new Label("Typ een getal: ");
        tekstvak.addActionListener(new Textvaklistener());
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g){
        g.drawString("het getal is: " + getal, 50, 50);

    }

    class Textvaklistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }

}