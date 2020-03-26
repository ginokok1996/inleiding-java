package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht  extends Applet{
    TextField naamtekst;
    TextField emailtekst;
    Label naamlabel;
    Label emaillabel;
    Label hoeveelheid;
    Button button;
    int index = 0, aantal = 0;
    //regeld spacing van mails en namen.
    int y = 100;
    String lossenaam, losseemail;

    String[] namen, email;

    public void init(){
        namen = new String[10];
        email = new String[10];

        naamlabel = new Label("Vul je naam in:");
        emaillabel = new Label("Vul je E-mail in:");
        hoeveelheid = new Label(aantal + "/10");
        button = new Button("Submit");
        button.addActionListener(new buttonhandler());
        naamtekst = new TextField(20);
        emailtekst = new TextField(40);

        add(naamlabel);
        add(naamtekst);
        add(emaillabel);
        add(emailtekst);
        add(button);
        add(hoeveelheid);
    }

    public void paint(Graphics g){

        if(index == 10){
            for(int i = 0; i < namen.length; i++){
                g.drawString(""+ namen[i], 60, y);
                g.drawString("" + email[i], 120, y);
                y += 20;
            }
        }
    }

    class buttonhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            lossenaam = naamtekst.getText();
            losseemail = emailtekst.getText();

            if(index <= 10){
                namen[index] = lossenaam;
                email[index] = losseemail;
                aantal ++;
                index ++;
                hoeveelheid.setText(aantal + "/10");
            }
            naamtekst.setText("");
            emailtekst.setText("");
            repaint();
        }
    }

}
