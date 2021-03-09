package de.NikomitK.SchiebePuzzle;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{

    private Steuerung dieSteuerung;
    char aTyp;
    char aFarbe;
    int aGroesse;
    Taste [] aTastenFeld;

    private JPanel panelBedienung, panelFeld;
    private JLabel labelArt, labelGroesse;
    private JRadioButton radioZahlen, radio2x2, radio3x3, radio4x4;
    private JButton buttonNeuesSpiel, buttonSpielBeenden;

    public GUI(){
        dieSteuerung = new Steuerung(this);
        erzeugeOberflaeche();
    }

    private void erzeugeOberflaeche(){

        initGUI();
    }

    private void initPuzzleZF(){

    }

    private void initGUI(){
        panelFeld = new JPanel();
        panelBedienung = new JPanel();
        labelArt = new JLabel("Puzzleart");
        radioZahlen = new JRadioButton("ZahlenPuzzle");
        labelGroesse = new JLabel("Größe");
        radio2x2 = new JRadioButton("2x2");
        radio3x3 = new JRadioButton("3x3");
        radio4x4 = new JRadioButton("4x4");
        buttonNeuesSpiel = new JButton("Neues Spiel");
        buttonSpielBeenden = new JButton("Spiel Beenden");
        panelFeld.setBackground(Color.yellow);
        panelBedienung.setBackground(Color.red);

        GridLayout gitterLayout = new GridLayout(0, 1);
        panelBedienung.setLayout(gitterLayout);

        add(panelFeld, BorderLayout.CENTER);
        add(panelBedienung, BorderLayout.EAST);


        panelBedienung.add(labelArt);
        panelBedienung.add(radioZahlen);
        panelBedienung.add(labelGroesse);
        panelBedienung.add(radio2x2);
        panelBedienung.add(radio3x3);
        panelBedienung.add(radio4x4);
        panelBedienung.add(buttonNeuesSpiel);
        panelBedienung.add(buttonSpielBeenden);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void setzeTastenFarbe(char farbe){

    }

    public void setzeTastenZahlen(int [] zahlenFeld){

    }

    public void melde(String pTextNr){

    }

    public static void main(String [] args){
        System.out.println("Spielstart");
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new GUI();
            }
        });
        System.out.println("Spielende");
    }

}
