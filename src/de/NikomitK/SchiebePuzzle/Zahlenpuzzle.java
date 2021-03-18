package de.NikomitK.SchiebePuzzle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zahlenpuzzle extends Schiebepuzzle {

    private Random r;
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
        r = new Random();
        System.out.println("erzeugePuzzleFeld");

        int groesse = gibGroesse();

        aZahlenFeld = new int[groesse * groesse];

        for(int i = 0; i < aZahlenFeld.length; i++){
            aZahlenFeld[i] = i;
            System.out.println(aZahlenFeld[i]);
        }
        // absolut kein plan ob das so passt, erstmal nicht abschreiben
        for(int i = 0; i<aZahlenFeld.length; i++){
            int zufallsPosition = r.nextInt(8);
            int temp = aZahlenFeld[i];
            aZahlenFeld[i] = aZahlenFeld[zufallsPosition];
            aZahlenFeld[zufallsPosition] = temp;
        }

        System.out.println();
        for (int i = 0; i < aZahlenFeld.length; i++) System.out.println(aZahlenFeld[i]);
//        eigene methode für zufall
//        aUnusedNums = new ArrayList<>(); //idk ob das passt, selbstversuch
//        for(int i = 0; i<groesse*groesse; i++){
//            aUnusedNums.add(i);
//        }
//        for(int i = 0; i<aZahlenFeld.length; i++){
//            int temp = r.nextInt(aUnusedNums.size());
//            aZahlenFeld[i] = aUnusedNums.get(temp);
//            aUnusedNums.remove(temp);
//        System.out.println(aZahlenFeld[i]);
//        }
    }

    public void tauscheTastenWerte(int pIdxTaste, int pIdxLeertaste){

    }
}
