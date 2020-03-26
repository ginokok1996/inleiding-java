package h12;

import java.awt.*;
import java.applet.*;



public class Opdracht_12_2  extends Applet{

    Button[] button;

    public void init(){

        button = new Button[25];

        for(int i = 0; i < button.length; i++){
            button[i] = new Button("Ok");
            add(button[i]);
        }
    }

    public void paint(Graphics g){

    }


}
