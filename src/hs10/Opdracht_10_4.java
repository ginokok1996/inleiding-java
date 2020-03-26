package hs10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_10_4  extends Applet{
    Label maandlabel;
    Label jaarlabel;
    TextField dagentekst;
    TextField jarentekst;
    int dagen, jaar;
    String maand;

    public void init(){
        maandlabel = new Label("Vul maand nummer in: ");
        jaarlabel = new Label("Vul jaartal in:");
        jarentekst = new TextField(20);
        jarentekst.addActionListener(new dagenhandler());
        dagentekst = new TextField(20);
        dagentekst.addActionListener(new dagenhandler());
        maand = "";

        add(maandlabel);
        add(dagentekst);
        add(jaarlabel);
        add(jarentekst);
    }

    public void paint(Graphics g){
        g.drawString("De maand: " + maand + " heeft: "  + dagen + " dagen.", 50,150);
    }

    class dagenhandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int a = Integer.parseInt(dagentekst.getText());
            jaar = Integer.parseInt(jarentekst.getText());

            switch (a) {
                case 1:
                    maand = "Januari";
                    dagen = 31;
                    break;
                case 2:
                    if ((jaar % 4 == 0 && !(jaar % 100 == 0)) || (jaar % 400 == 0 )){
                        maand = "Februari";
                        dagen = 29;
                        break;
                    } else {
                        maand = "Februari";
                        dagen = 28;
                        break;
                    }
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
                    dagentekst.setText("Ongeldig");
                    maand = "";
                    dagen = 0;
                    break;
            }
            repaint();
        }
    }


}
