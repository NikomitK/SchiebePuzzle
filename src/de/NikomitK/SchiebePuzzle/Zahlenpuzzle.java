package de.NikomitK.SchiebePuzzle;

public class Zahlenpuzzle extends Schiebepuzzle {

    private int [] aZahlenFeld;

    public Zahlenpuzzle(int pGroesse){
        super(pGroesse);
        erzeugePuzzleFeld();
        System.out.println("Konstruktor Zahlenpuzzle");
        System.out.println("groesse " + pGroesse);
    }

    @Override
    public boolean puzzleGeloest() {
        return true;
    }

    public int [] gibZahlenFeld(){

        return aZahlenFeld;
    }

    private void erzeugePuzzleFeld(){
        System.out.println("erzeugePuzzleFeld");

        int groesse = gibGroesse();
    }

    public void tauscheTastenWerte(int pIdxTaste, int pIdxLeertaste){

    }
}
