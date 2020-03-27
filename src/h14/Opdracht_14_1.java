package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_14_1  extends Applet{
    Button button;
    int randomkleur;
    int randomkaart;
    double r = Math.random();

    String[] kleuren = {"Harten", "Schoppen", "Klaver", "Ruiten"};
    String[] kaarten = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "koning"};





    public void init(){
        button = new Button("Volgende");
        button.addActionListener(new buttonhandler());

        randomkleur = (int) (r * kleuren.length );
        randomkaart = (int) (r * kaarten.length );

        add(button);
    }

    public void paint(Graphics g){
        g.drawString(kleuren[randomkleur] + " " + kaarten[randomkaart], 50, 50 );
    }

    class buttonhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            r = Math.random();
            randomkleur = (int) (r * kleuren.length);
            randomkaart = (int) (r * kaarten.length );
            repaint();
        }
    }


}
