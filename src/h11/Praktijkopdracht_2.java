package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht_2 extends Applet{
    Label label;
    Button button;
    int y = -100;
    int tafel;

    public void init(){
        label = new Label("Klik voor volgende tafel");
        button = new Button("Ok");
        button.addActionListener(new buttonhandler());

        add(label);
        add(button);
    }

    public void paint(Graphics g){
        int berekening;

        for(int i = 1; i <= 10; i++){
            berekening = tafel * i;
            g.drawString("" + berekening, 50, y );
            y += 15;
        }

    }

    class buttonhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(tafel == 10){
                tafel = 1;
            }else{
                tafel ++;
            }


            y = 50;
            repaint();
        }
    }
}