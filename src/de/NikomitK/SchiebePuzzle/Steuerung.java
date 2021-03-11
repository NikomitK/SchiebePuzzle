package de.NikomitK.SchiebePuzzle;

public class Steuerung {
    String aZustand;
    int aIntervallDauer;
    int aMaxKlicks;
    Zahlenpuzzle dasZahlenpuzzle;
    GUI dieGUI;


    public Steuerung(GUI pGui){
        dieGUI = pGui;
    }

    public void timeEreignis(){

    }

    public void tastenKlick(){

    }

    public void neuesSpiel(char pTyp, int pGroesse){
        System.out.println("neues spiel");
        System.out.println("typ " + pTyp + ", groesse " + pGroesse);
        dasZahlenpuzzle = new Zahlenpuzzle(pGroesse);
        int [] dasZF;
        dasZF = dasZahlenpuzzle.gibZahlenFeld();
        dieGUI.setzeTastenZahlen(dasZF);
    }

    public void endeSpiel(){

    }

}
