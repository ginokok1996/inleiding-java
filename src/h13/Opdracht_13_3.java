package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht_13_3  extends Applet{
    Button rodemuur;
    Button grijzemuur;
    int x, y, width, height;
    String steenkleur;

    public void init(){
        rodemuur = new Button("Rood");
        rodemuur.addActionListener(new rodehandler());
        grijzemuur = new Button("Grijs");
        grijzemuur.addActionListener(new grijzehandler());

        add(rodemuur);
        add(grijzemuur);

    }

    public void paint(Graphics g){
        tekenmuur(g, x, y, width, height, steenkleur);

    }

    class rodehandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            x = 40;
            y = 40;
            width = 40;
            height = 20;
            steenkleur = "red";
            repaint();
        }
    }

    class grijzehandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            x = 40;
            y = 40;
            width = 80;
            height = 40;
            steenkleur = "gray";
            repaint();
        }
    }

    void tekenmuur(Graphics g, int x, int y, int width, int height, String steenkleur){
        for (int i = 0; i < 10; i++) {
            x = 20;
            for (int j = 0; j < 20 ; j++) {
                if(steenkleur.equals("red")){
                    g.setColor(Color.red);
                }else if(steenkleur.equals("gray")) {
                    g.setColor(Color.gray);
                }
                g.fillRect(x, y, width, height);
                g.setColor(Color.black);
                g.drawRect(x, y , width, height);
                x+= width;
            }
            y += height;
        }
    }
}
