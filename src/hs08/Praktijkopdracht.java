package hs08;

import javax.xml.soap.Text;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht  extends Applet{
    TextField eerstecijfer;
    TextField tweedecijfer;
    Button plus;
    Button min;
    Button keer;
    Button delen;
    double nummer1, nummer2, antwoord;

    public void init(){
        eerstecijfer = new TextField("",20);
        tweedecijfer = new TextField("", 20);
        plus = new Button("+");
        plus.addActionListener(new pluslistener());
        min = new Button("-");
        min.addActionListener(new minlistener());
        keer = new Button("*");
        keer.addActionListener(new keerlistener());
        delen = new Button("/");
        delen.addActionListener(new delenlistener());

        add(eerstecijfer);
        add(tweedecijfer);
        add(plus);
        add(min);
        add(keer);
        add(delen);
    }

    public void paint(Graphics g){
    }

    //listener voor het optellen van de 2 cijfers.
    class pluslistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            nummer1 = Double.parseDouble(eerstecijfer.getText());
            nummer2 = Double.parseDouble(tweedecijfer.getText());
            antwoord = nummer1 + nummer2;
            eerstecijfer.setText("" + antwoord);
            tweedecijfer.setText("");
            repaint();
        }
    }

    //listener voor het aftrekken van de 2 cijfers.
    class minlistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            nummer1 = Double.parseDouble(eerstecijfer.getText());
            nummer2 = Double.parseDouble(tweedecijfer.getText());
            antwoord = nummer1 - nummer2;
            eerstecijfer.setText("" + antwoord);
            tweedecijfer.setText("");
            repaint();
        }
    }

    //listener voor het vermedigvuldigen van de 2 cijfers.
    class keerlistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            nummer1 = Double.parseDouble(eerstecijfer.getText());
            nummer2 = Double.parseDouble(tweedecijfer.getText());
            antwoord = nummer1 * nummer2;
            eerstecijfer.setText("" + antwoord);
            tweedecijfer.setText("");
            repaint();
        }
    }

    //listener voor het delen van de 2 cijfers.
    class delenlistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            nummer1 = Double.parseDouble(eerstecijfer.getText());
            nummer2 = Double.parseDouble(tweedecijfer.getText());
            antwoord = nummer1 / nummer2;
            eerstecijfer.setText("" + antwoord);
            tweedecijfer.setText("");
            repaint();
        }
    }



}
