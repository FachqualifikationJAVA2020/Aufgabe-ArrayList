package de.thunderfrog;

import java.util.ArrayList;
import java.util.Arrays;

public class PaartauschTest {
    public static void main(String[] args) {
        String[] beethoven = {"Freude","schöner","Götterfunken","Tochter","aus","Elysium"};
        String[] kwak = {"Warum ","bin","ich","so","fröhlich","?"};

        ArrayList<Object> beethovenList = new ArrayList<>(Arrays.asList(beethoven));
        ArrayList<Object> kwakList = new ArrayList<>(Arrays.asList(kwak));

        Paartausch beethovenArray = new Paartausch(beethovenList);
        Paartausch kwakArray = new Paartausch(kwakList);


    }
}
