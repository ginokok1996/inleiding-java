package hs08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_8_3  extends Applet{
    Label label;
    Button button;
    TextField tekstveld;
    double btw;
    double totaal;



    public void init(){
        tekstveld = new TextField("", 20);
        tekstveld.addActionListener(new tekstveldhandler());
        button = new Button("Ok");
        button.addActionListener(new buttonhandler());
        label = new Label("Vul bedrag in:");
        add(label);
        add(tekstveld);
        add(button);
    }

    public void paint(Graphics g){
        g.drawString("Bedrag met btw: " + totaal, 50,50);
    }

    class buttonhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            btw = Double.parseDouble(tekstveld.getText());
            totaal = Double.parseDouble(tekstveld.getText());
            btw = btw / 100 * 21;
            totaal += btw;
            repaint();
        }
    }

    class tekstveldhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            btw = Double.parseDouble(tekstveld.getText());
            totaal = Double.parseDouble(tekstveld.getText());
            btw = btw / 100 * 21;
            totaal += btw;
            repaint();
        }
    }


}
