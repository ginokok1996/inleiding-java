package hs10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_10_2  extends Applet{

    TextField tekstveld;
    Label label;
    double hooggetal, laaggetal;


    public void init(){
        tekstveld = new TextField("", 20);
        tekstveld.addActionListener(new tekstveldhandler());
        label = new Label("Vul een getal in: ");
        add(label);
        add(tekstveld);
    }

    public void paint(Graphics g){
        g.drawString("Het hoogst ingevulde getal tot nu toe is: " + hooggetal, 50,70);
        g.drawString("Het laagst ingevulde getal tot nu toe is: " + laaggetal, 50, 90);
    }

    class tekstveldhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double a = Double.parseDouble(tekstveld.getText());
            if(a > hooggetal){
                hooggetal = a;
                repaint();
            }
            if(laaggetal == 0){
                laaggetal = hooggetal;
                repaint();
            }else if(a < laaggetal){
                laaggetal = a;
                repaint();
            }
        }
    }
}