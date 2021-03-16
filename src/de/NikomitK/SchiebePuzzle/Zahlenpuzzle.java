package de.NikomitK.SchiebePuzzle;

public class Zahlenpuzzle extends Schiebepuzzle {
    int [] aZahlenFeld;

    public Zahlenpuzzle(int pGroesse){
        super(pGroesse);

    }

    @Override
    public boolean puzzleGeloest() {
        return false;
    }

    public int [] gibZahlenFeld(){

        return aZahlenFeld;
    }

    private void erzeugePuzzleFeld(){

    }

    public void tauscheTastenWerte(int pIdxTaste, int pIdxLeertaste){

    }
}
