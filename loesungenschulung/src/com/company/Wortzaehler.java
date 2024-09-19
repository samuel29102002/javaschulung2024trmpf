package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Wortzaehler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib einen Text ein:");
        String text = scanner.nextLine();

        String[] woerter = text.split("\\s+");

        HashMap<String, Integer> wortHaeufigkeit = new HashMap<String, Integer>();

        for (String wort : woerter) {
            wort = wort.toLowerCase();
            if (wortHaeufigkeit.containsKey(wort)) {
                wortHaeufigkeit.put(wort, wortHaeufigkeit.get(wort) + 1);
            } else {
                wortHaeufigkeit.put(wort, 1);
            }
        }

        System.out.println("Wortfrequenz im Text:");
        for (String wort : wortHaeufigkeit.keySet()) {
            System.out.println(wort + ": " + wortHaeufigkeit.get(wort));
        }

        scanner.close();
    }
}