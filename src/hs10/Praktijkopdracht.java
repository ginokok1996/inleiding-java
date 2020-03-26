package hs10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht  extends Applet{

    Label label;
    TextField tekstveld;
    int cijfer;
    String beoordeling = "";

    public void init(){
        tekstveld = new TextField(20);
        tekstveld.addActionListener(new teksthandler());
        label = new Label("Vul je cijfer in: ");

        add(label);
        add(tekstveld);

    }

    public void paint(Graphics g){
        g.drawString("Dit cijfer is een: " + beoordeling, 50,50);
    }

    class teksthandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            cijfer = (int) Math.round(Double.parseDouble(tekstveld.getText()));

            switch (cijfer) {
                case  1:
                case  2:
                case  3:
                    beoordeling = "Slecht";
                    break;
                case  4:
                    beoordeling = "Onvoldoende";
                    break;
                case  5:
                    beoordeling = "matig";
                    break;
                case  6:
                case  7:
                    beoordeling = "Voldoende";
                    break;
                case  8:
                case  9:
                case 10:
                    beoordeling = "goed";
                    break;
                default:
                    beoordeling = "Je heb een ongeldig nummer ingevoerd";
            }
            repaint();

        }
    }

}
