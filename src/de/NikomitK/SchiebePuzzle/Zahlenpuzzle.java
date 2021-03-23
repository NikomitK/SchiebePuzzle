package de.NikomitK.SchiebePuzzle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zahlenpuzzle extends Schiebepuzzle {

    private Random r;
    public static int [] aZahlenFeld;
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

        // Array Zahlen zuweisen
        for(int i = 0; i < aZahlenFeld.length; i++){
            aZahlenFeld[i] = i;
            System.out.println(aZahlenFeld[i]);
        }

        // Array Mischeln
        for(int j = 0; j<50; j++){
            for (int i = 0; i < aZahlenFeld.length; i++) {
                int zufallsPosition = r.nextInt((groesse*groesse)-1);
                int temp = aZahlenFeld[i];
                aZahlenFeld[i] = aZahlenFeld[zufallsPosition];
                aZahlenFeld[zufallsPosition] = temp;
            }
        }

        System.out.println("Array zufällig");
        for (int j : aZahlenFeld) System.out.println(j);
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
