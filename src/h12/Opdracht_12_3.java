package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class Opdracht_12_3  extends Applet{

    Button button;
    TextField[] tekstveld;
    double[] getallen;

    public void init(){
        getallen = new double[5];
        tekstveld = new TextField[5];

        for(int i = 0; i < tekstveld.length; i++){
            tekstveld[i] = new TextField(5);
            add(tekstveld[i]);
        }
        button = new Button("Ok");
        button.addActionListener(new buttonhandler());

        add(button);
    }

    public void paint(Graphics g){

    }

    class buttonhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            for(int i = 0; i < tekstveld.length; i ++){
                getallen[i] = Double.parseDouble(tekstveld[i].getText());
            }

            Arrays.sort(getallen);

            for(int i = 0; i < getallen.length; i++){
                tekstveld[i].setText(String.valueOf(getallen[i]));
            }
            repaint();
        }
    }
}