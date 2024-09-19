package com.company;

import java.util.Scanner;
import java.util.Random;

public class ErrateDieZahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int zuErraten = random.nextInt(100) + 1;
        int rateVersuche = 0;
        int userRate = 0;

        System.out.println("Errate eine Zahl zwischen 1 und 100!");

        while (userRate != zuErraten) {
            System.out.print("Dein Tipp: ");
            userRate = scanner.nextInt();
            rateVersuche++;

            if (userRate < zuErraten) {
                System.out.println("Zu niedrig!");
            } else if (userRate > zuErraten) {
                System.out.println("Zu hoch!");
            } else {
                System.out.println("Richtig geraten! Du hast " + rateVersuche + " Versuche gebraucht.");
            }
        }

        scanner.close();
    }
}