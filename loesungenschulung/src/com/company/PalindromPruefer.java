package com.company;

import java.util.Scanner;

public class PalindromPruefer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib ein Wort oder einen Satz ein:");
        String eingabe = scanner.nextLine();

        String gereinigteEingabe = eingabe.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String umgekehrt = new StringBuilder(gereinigteEingabe).reverse().toString();
        if (gereinigteEingabe.equals(umgekehrt)) {
            System.out.println("Das ist ein Palindrom!");
        } else {
            System.out.println("Das ist kein Palindrom.");
        }

        scanner.close();
    }
}

