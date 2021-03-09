package de.NikomitK.SchiebePuzzle;

public abstract class Schiebepuzzle {

    int aGroesse;
    int aAnzahlKlicks;
    public Schiebepuzzle(int pGroesse){

    }

    protected int gibGroesse(){
        return aGroesse;
    }

    public abstract boolean puzzleGeloest();

    public int gibAnzahlKlicks(){

        return aAnzahlKlicks;
    }

    public int inkrAnzahlKlicks(){

        return 0;
    }

}
