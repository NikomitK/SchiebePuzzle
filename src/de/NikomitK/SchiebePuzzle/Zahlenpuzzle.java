package de.NikomitK.SchiebePuzzle;

import java.util.ArrayList;
import java.util.List;

public class Zahlenpuzzle extends Schiebepuzzle {

    private int [] aZahlenFeld;
    private List<Integer> aUnusedNums;
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

        aZahlenFeld = new int[groesse * groesse];
        aUnusedNums = new ArrayList<>();
    }

    public void tauscheTastenWerte(int pIdxTaste, int pIdxLeertaste){

    }
}
