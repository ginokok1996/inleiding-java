package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_12_6  extends Applet{
    double[] getallen = {1,1,1,1,2,2,3,3,3,3,3,4,4,4,5,6,6,6,7,8,8,8,8,8,9,9,9,9,9,10,10,10};
    double gekozencijfer;
    int dubbelecijfers;

    TextField tekstveld;
    Button button;
    Label label;

    public void init(){
        label = new Label("Vul een cijfer in: ");
        tekstveld = new TextField(5);
        button = new Button("Ok");
        button.addActionListener(new buttonhandler());

        add(label);
        add(tekstveld);
        add(button);

    }

    public void paint(Graphics g){
        g.drawString("Het cijfer " + gekozencijfer + " komt " + dubbelecijfers + " keer voor in het array.",50 ,50);
    }

    class buttonhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            gekozencijfer = Double.parseDouble(tekstveld.getText());
            dubbelecijfers = 0;

            for(int i = 0; i < getallen.length; i++){
                if(gekozencijfer == getallen[i]){
                    dubbelecijfers ++;
                }
            }
            repaint();

        }
    }

}