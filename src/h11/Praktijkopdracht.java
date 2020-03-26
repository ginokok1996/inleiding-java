package h11;


import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht  extends Applet{
    Label label;
    TextField tekstveld;
    Button button;
    int y = -100;
    int tafel;

    public void init(){
        label = new Label("Vul een tafel in: ");
        tekstveld = new TextField(5);
        tekstveld.addActionListener(new buttonhandler());
        button = new Button("Ok");
        button.addActionListener(new buttonhandler());

        add(label);
        add(tekstveld);
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
            tafel = Integer.parseInt(tekstveld.getText());
            y = 50;
            repaint();
        }
    }
}
