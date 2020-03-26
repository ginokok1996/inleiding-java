package hs10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_10_3  extends Applet{
    Label label;
    TextField tekstveld;
    int dagen;
    String maand;

    public void init(){
        label = new Label("Vul maand nummer in: ");
        tekstveld = new TextField(20);
        tekstveld.addActionListener(new veldhandler());
        maand = "";

        add(label);
        add(tekstveld);
    }

    public void paint(Graphics g){
        g.drawString("De maand: " + maand + " heeft: "  + dagen + " dagen.", 50,50);
    }

    class veldhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int a = Integer.parseInt(tekstveld.getText());

            switch (a) {
                case 1:
                    maand = "Januari";
                    dagen = 31;
                    break;
                case 2:
                    maand = "Februari";
                    dagen = 28;
                    break;
                case 3:
                    maand = "Maart";
                    dagen = 31;
                    break;
                case 4:
                    maand = "April";
                    dagen = 30;
                    break;
                case 5:
                    maand = "Mei";
                    dagen = 31;
                    break;
                case 6:
                    maand = "Juni";
                    dagen = 30;
                    break;
                case 7:
                    maand = "Juli";
                    dagen = 31;
                    break;
                case 8:
                    maand = "Augustus";
                    dagen = 31;
                    break;
                case 9:
                    maand = "September";
                    dagen = 30;
                    break;
                case 10:
                    maand = "Oktober";
                    dagen = 31;
                    break;
                case 11:
                    maand = "November";
                    dagen = 30;
                    break;
                case 12:
                    maand = "December";
                    dagen = 31;
                    break;
                default:
                    tekstveld.setText("Ongeldig");
                    maand = "";
                    dagen = 0;
                    break;
            }
            repaint();
        }
    }


}
