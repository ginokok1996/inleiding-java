package h14;

import javax.xml.soap.Text;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class Praktijkopdracht  extends Applet{

    Label label;
    TextField tekstveld;
    Button button;


    private Image afbeelding;
    private URL pad;

    int aantal;
    int y = 20, x = 20, teller = 0;
    String melding = "";
    double r = Math.random();

    public void init(){
        label = new Label("Hoeveel pucks neem je? (1, 2 of 3)");
        tekstveld = new TextField(2);
        button = new Button("Speel");
        button.addActionListener(new buttonhandler());

        pad = Afbeelding.class.getResource("/resources/");
        afbeelding = getImage(pad, "puck.png");
        aantal = 23;

        add(label);
        add(tekstveld);
        add(button);
    }

    public void paint(Graphics g){
        y = 50;
        x = 50;


        g.drawString("" + melding, 20, 50);
        g.drawString("Aantal pucks: " + aantal + "." ,20,70);

        //tekent de plaatjes
        for (int i = 0; i < aantal; i++) {
                if(i % 4 == 0){
                  y+= 60;
                  x = 20;
                }
                g.drawImage(afbeelding, x, y, 40, 40, this);
                x += 60;
        }
    }

    class buttonhandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int keuze = Integer.parseInt(tekstveld.getText());

            //kijkt of keuze geldig is
            if(keuze <= 3 && keuze > 0){
                melding = "";
                aantal = aantal - keuze;

                //bepaald of er gewonnen of veloren is
                if (aantal == 1) {
                    melding = "Gewonnen";
                    aantal = 0;
                } else if (aantal < 1){
                    melding = "Veloren";
                    aantal = 0;
                }

                //bepaald de zet van de computer
                switch (aantal){
                    case 2:
                        aantal -= 1;
                        melding = "De computer haalt 1 puck weg";
                        break;
                    case 3:
                        aantal -= 2;
                        melding = "De computer haalt 2 pucks weg";
                        break;
                    case 4:
                        aantal -= 3;
                        melding = "De computer haalt 3 pucks weg";
                        break;
                    case 5:
                        aantal -= 1;
                        melding = "De computer haalt 1 puck weg";
                        break;
                    case 6:
                        aantal -= 3;
                        melding = "De computer haalt 3 pucks weg";
                        break;
                    default:
                        if(aantal > 0){
                            r = Math.random();
                            teller = aantal;
                            aantal -= (r * 3);
                            teller = teller - aantal;
                            melding = "de computer haalt " + teller +" pucks weg";
                        }
                        break;
                }
            } else {
                melding = "Onjuist aantal ingevoerd!";
            }

            repaint();
        }
    }

}

