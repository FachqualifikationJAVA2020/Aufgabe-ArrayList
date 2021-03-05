package de.thunderfrog;

import java.util.ArrayList;

public class Paartausch {

    // Konstruktor mit dem Parameter einer ArrayList
    public Paartausch(ArrayList<Object> aList){
        switchPair(aList);
    }
    public Paartausch(){}

    // Methode zum Vertauschen der Paare, nur über den Konstruktor aufrufbar
    private static void switchPair(ArrayList<Object> aList) {

        System.out.println("Ursprüngliche Liste:");
        System.out.println(aList+ "\n");
        System.out.println("Nach dem vertauschen:");

        Object temp;

        // Objekte vertauchen
        for(int i = 0; i < aList.size() -1; i += 2){
            temp = aList.get(i);
            aList.set(i, aList.get(i+1));
            aList.set(i+1,temp);
        }
        System.out.println(aList);
    }

    public static void switchPairM(ArrayList<Object> aList){
        switchPair(aList);
    }
}
