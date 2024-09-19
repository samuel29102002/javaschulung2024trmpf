package com.company;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean weiter = true;

        while (weiter) {
            System.out.println("Gib die erste Zahl ein:");
            double zahl1 = scanner.nextDouble();

            System.out.println("Gib die zweite Zahl ein:");
            double zahl2 = scanner.nextDouble();

            System.out.println("Wähle eine Operation (+, -, *, /):");
            char operation = scanner.next().charAt(0);
            double ergebnis = 0;

            switch (operation) {
                case '+':
                    ergebnis = zahl1 + zahl2;
                    break;
                case '-':
                    ergebnis = zahl1 - zahl2;
                    break;
                case '*':
                    ergebnis = zahl1 * zahl2;
                    break;
                case '/':
                    ergebnis = zahl1 / zahl2;
                    break;
                default:
                    System.out.println("Ungültige Operation.");
                    continue;
            }

            System.out.println("Ergebnis: " + ergebnis);

            System.out.println("Möchtest du eine weitere Berechnung durchführen? (ja/nein)");
            String antwort = scanner.next();
            weiter = antwort.equalsIgnoreCase("ja");
        }

        scanner.close();
    }
}