package de.NikomitK.SchiebePuzzle;

import javax.swing.*;

public class Taste extends JButton {


    private int x, y;

    public Taste(int px, int py){
        x = px;
        y = py;
        setText(x + "/" + y);
    }

    public int gibX(){
        return x;
    }

    public int gibY(){
        return y;
    }
}
