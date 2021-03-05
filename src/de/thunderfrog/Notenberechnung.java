package de.thunderfrog;

import java.util.ArrayList;
import java.util.Scanner;

public class Notenberechnung {

    public static void main(String[] args) {

        boolean cancel = false;
        double grade;
        String command;
        String endCommand = "ende";
        String exitCommand = "beenden";

        Scanner in = new Scanner(System.in);

        ArrayList<Double> gradeAverage = new ArrayList<>();

        System.out.println("Willkommen beim Notendurchschnitt berrechnen");
        System.out.println("Zum Beenden der Eingabe bitte " + endCommand + " eingeben");
        System.out.println("Zum Beenden des Programms bitte " + exitCommand + " eingeben");

        while(!cancel){
            System.out.println("Bitte eine Note eingeben:");

            // Prüfen ob die Eingabe ein double ist
            if(in.hasNextDouble()){
                // Den Wert in der Variablen speichern
                grade = in.nextDouble();

                // Prüfen ob es korrekte Noten sind, wenn nicht Fehlermeldung ausgeben
                if(grade > 0.9 && grade < 6.1) {
                    gradeAverage.add(grade);
                    cancel = false;
                } else {
                    System.out.println("Bitte eine Zahl zwischen 1 und 6 eingeben!");
                    cancel = false;
                }
            // Wenn kein double Wert eingegeben wurde
            } else if(in.hasNext()){
                command = in.next();

                // Prüfen ob ein Command eingeben wurde und dann die entsprechende Aktion ausführen
                if(command.toLowerCase().equals(endCommand)){
                    System.out.println("Die Noten sind:");

                    // Alle Note nochmal ausgeben
                    for(int i = 0; i < gradeAverage.size(); i++){
                        System.out.print(gradeAverage.get(i) + " ");
                    }
                    System.out.println(" ");

                    // Notendurchschnitt berechnen
                    System.out.println("Der Notendurchschnitt beträgt: " + berechneDurchschnitt(gradeAverage));
                    cancel = true;
                }
                if(command.toLowerCase().equals(exitCommand)){
                    System.out.println("Das Programm wird beendet");

                    // Programm beenden
                    System.exit(0);
                }
            }
        }

    }

    private static double berechneDurchschnitt(ArrayList<Double> gradeAverage) {
        double sum = 0;

        // Alle Einträge in ArrayList gradeAverage zusammen rechnen
        for(int i = 0; i < gradeAverage.size(); i++){
            sum += gradeAverage.get(i);
        }

        // Die Summe durch die gesamt Anzahl im Array teilen
        return sum / gradeAverage.size();
    }
}
