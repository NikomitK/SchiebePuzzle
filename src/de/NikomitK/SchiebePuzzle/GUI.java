package de.NikomitK.SchiebePuzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame{

    private Steuerung dieSteuerung;
    char aTyp;
    char aFarbe;
    int aGroesse;
    Taste [] aTastenFeld;

    private JPanel panelBedienung, panelFeld;
    private JLabel labelArt, labelGroesse;
    private JRadioButton radioZahlen, radio2x2, radio3x3, radio4x4, radioBilder;
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
        radioBilder = new JRadioButton("Bilder");
        buttonNeuesSpiel = new JButton("Neues Spiel");
        buttonSpielBeenden = new JButton("Spiel Beenden");
        panelFeld.setBackground(Color.DARK_GRAY);
        panelBedienung.setBackground(Color.red);

        GridLayout gitterLayout = new GridLayout(0, 1);
        panelBedienung.setLayout(gitterLayout);

        add(panelFeld, BorderLayout.CENTER);
        add(panelBedienung, BorderLayout.EAST);


        panelBedienung.add(labelArt);
        panelBedienung.add(radioZahlen);
        panelBedienung.add(radioBilder);
        panelBedienung.add(labelGroesse);
        panelBedienung.add(radio2x2);
        panelBedienung.add(radio3x3);
        panelBedienung.add(radio4x4);
        panelBedienung.add(buttonNeuesSpiel);
        panelBedienung.add(buttonSpielBeenden);

        radio3x3.setSelected(true);
        radioZahlen.setSelected(true);

        buttonNeuesSpiel.addActionListener((ActionEvent e) ->{
            System.out.println("neues spiel geklickt");

            char art = 'z';
            int groesse = 3;

            if(radioZahlen.isSelected() == true){
                art = 'z';
            }
            if(radioZahlen.isSelected() == true){
                art = 'b';
            }
            if(radio2x2.isSelected() == true){
                groesse = 2;
            }
            else if(radio3x3.isSelected() == true){
                groesse = 3;
            }
            else{
                groesse = 4;
            }

            dieSteuerung.neuesSpiel(art, groesse);
        });
        radio2x2.addActionListener((ActionEvent e) ->{
            System.out.println("radio2x2 aktiv");
            radio2x2.setSelected(true);
            radio3x3.setSelected(false);
            radio4x4.setSelected(false);
        });

        radio3x3.addActionListener((ActionEvent e) ->{
            System.out.println("radio3x3 aktiv");
            radio2x2.setSelected(false);
            radio3x3.setSelected(true);
            radio4x4.setSelected(false);
        });

        radio4x4.addActionListener((ActionEvent e) ->{
            System.out.println("radio4x4 aktiv");
            radio2x2.setSelected(false);
            radio3x3.setSelected(false);
            radio4x4.setSelected(true);
        });

        radioZahlen.addActionListener((ActionEvent e) ->{
            System.out.println("radioZahlen aktiv");
            radioZahlen.setSelected(true);
            radioBilder.setSelected(false);
        });

        radioBilder.addActionListener((ActionEvent e) ->{
            System.out.println("radioBilder aktiv");
            radioZahlen.setSelected(false);
            radioBilder.setSelected(true);
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void setzeTastenFarbe(char farbe){

    }

    public void setzeTastenZahlen(int [] pZahlenFeld){
        System.out.println("setzeTastenZahlen");
        int arrayGroesse = pZahlenFeld.length;
        GridLayout gitterLayout = null;

        if(arrayGroesse ==  4) gitterLayout = new GridLayout(0, 2);
        else if(arrayGroesse == 9) gitterLayout = new GridLayout(0, 3);
        else gitterLayout = new GridLayout(0, 4);

        panelFeld.setLayout(gitterLayout);

        aTastenFeld = new Taste[arrayGroesse];

        int width = (int) Math.sqrt(arrayGroesse);
        for(int i = 0; i<arrayGroesse; i++){
            aTastenFeld[i] = new Taste(i, Zahlenpuzzle.aZahlenFeld[i]);
            panelFeld.add(aTastenFeld[i]);
        }


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
