package h14;

import java.awt.*;
import java.applet.*;
import java.net.*;


public class Afbeelding extends Applet {

    private Image afbeelding;
    private URL pad;

    public void init() {
        pad = Afbeelding.class.getResource("/resources/");
        afbeelding = getImage(pad, "foto.jpeg");
    }

    public void paint(Graphics g) {
        g.drawImage(afbeelding, 20, 20, 250, 250, this);
    }
}