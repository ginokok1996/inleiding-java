package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_12_4  extends Applet{
    boolean gevonden;
    double[] cijfer = {6, 2, 12, 8, 15, 9, 4, 20, 17};
    double gezocht;
    int index;
    Label label;
    TextField tekstveld;
    Button button;



    public void init(){
        label = new Label("Naar welk nummer zoek je: ");
        tekstveld = new TextField(5);
        button = new Button("Ok");
        button.addActionListener(new buttonhandler());
        gevonden = false;
        gezocht = 0;

        add(label);
        add(tekstveld);
        add(button);
    }

    public void paint(Graphics g){
        if(gevonden){
            g.drawString("Het cijfer is gevonden op index: " + index, 50,50 );
        } else {
            g.drawString("Het cijfer is niet gevonden in het array.", 50, 50);
        }

    }

    class buttonhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            gezocht = Double.parseDouble(tekstveld.getText());
            int i = 0;
            while(i < cijfer.length){
                if(cijfer[i] == gezocht) {
                    gevonden = true;
                    index = i;
                } else {
                    gevonden = false;
                }
                i++;
            }
            repaint();
        }
    }

}
