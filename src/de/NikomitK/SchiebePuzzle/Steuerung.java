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

    public boolean nachbarPrüfen(int pIdxTaste, int pIdxLeertaste){
        int width = dasZahlenpuzzle.aGroesse;
        if(pIdxLeertaste == pIdxTaste  - width || pIdxLeertaste == pIdxTaste  + width) return true;
        else if((pIdxLeertaste == pIdxTaste - 1 || pIdxLeertaste == pIdxTaste + 1) && pIdxTaste/width == pIdxLeertaste/width) return true;
        else return false;
    }

    public void tastenKlick(int pIdxTaste){
        int pIdxLeertaste = dasZahlenpuzzle.gibLeerTasteIdx();
        dieGUI.aktualisiereTastenZahlen(dasZahlenpuzzle.gibZahlenFeld());
        if(nachbarPrüfen(pIdxTaste, pIdxLeertaste)) dasZahlenpuzzle.tauscheTastenWerte(pIdxTaste, pIdxLeertaste);
        dieGUI.aktualisiereTastenZahlen(dasZahlenpuzzle.gibZahlenFeld());
        if(dasZahlenpuzzle.puzzleGeloest()) System.out.println("FERTIG LUL");
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
