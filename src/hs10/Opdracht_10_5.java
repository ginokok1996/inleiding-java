package hs10;

import javax.xml.soap.Text;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_10_5  extends Applet{
    TextField eerstecijfer;
    TextField tweedecijfer;
    TextField derdecijfer;
    TextField vierdecijfer;
    TextField vijfdecijfer;
    Button button;
    double cijfer1, cijfer2, cijfer3, cijfer4, cijfer5, gemiddelde;
    int converter;
    String geslaagd = "", voldoende1 = "", voldoende2 = "", voldoende3= "", voldoende4 = "", voldoende5 = "";

    public void init(){
        button = new Button("Ok");
        button.addActionListener(new gemiddeldelistener());
        eerstecijfer = new TextField(5);
        tweedecijfer = new TextField(5);
        derdecijfer = new TextField(5);
        vierdecijfer = new TextField(5);
        vijfdecijfer = new TextField(5);

        add(eerstecijfer);
        add(tweedecijfer);
        add(derdecijfer);
        add(vierdecijfer);
        add(vijfdecijfer);
        add(button);
    }



    public void paint(Graphics g){
        g.drawString(voldoende1, 45,60);
        g.drawString(voldoende2, 110,60);
        g.drawString(voldoende3, 175,60);
        g.drawString(voldoende4, 240,60);
        g.drawString(voldoende5, 305,60);

        g.drawString("Het gemiddelde is: " + gemiddelde, 175, 120);
        g.drawString("Je bent met dit gemiddelde: " + geslaagd, 175, 140);

    }

    class gemiddeldelistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            cijfer1 = Double.parseDouble(eerstecijfer.getText());
            cijfer2 = Double.parseDouble(tweedecijfer.getText());
            cijfer3 = Double.parseDouble(derdecijfer.getText());
            cijfer4 = Double.parseDouble(vierdecijfer.getText());
            cijfer5 = Double.parseDouble(vijfdecijfer.getText());

            if(cijfer1 < 5.5){
                voldoende1 = "Onv";
            } else {
                voldoende1 = "Vol";
            }
            if(cijfer2 < 5.5){
                voldoende2 = "Onv";
            } else {
                voldoende2 = "Vol";
            }
            if(cijfer3 < 5.5){
                voldoende3 = "Onv";
            } else {
                voldoende3 = "Vol";
            }
            if(cijfer4 < 5.5){
                voldoende4 = "Onv";
            } else {
                voldoende4 = "Vol";
            }
            if(cijfer5 < 5.5){
                voldoende5 = "Onv";
            } else {
                voldoende5 = "Vol";
            }

            gemiddelde = (cijfer1 + cijfer2 + cijfer3 + cijfer4 + cijfer5) / 5;
            gemiddelde *= 10;
            converter = (int) gemiddelde;
            gemiddelde = converter;
            gemiddelde /= 10;

            if(gemiddelde >= 5.5){
                geslaagd = "Geslaagd";
            } else {
                geslaagd = "Gezakt";
            }
            repaint();
        }
    }

}

