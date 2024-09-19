package com.company;

class Bankkonto {
    private double saldo;

    public Bankkonto(double anfangssaldo) {
        this.saldo = anfangssaldo;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            saldo += betrag;
            System.out.println(betrag + " eingezahlt. Neues Saldo: " + saldo);
        }
    }

    public void abheben(double betrag) {
        if (betrag > 0 && betrag <= saldo) {
            saldo -= betrag;
            System.out.println(betrag + " abgehoben. Neues Saldo: " + saldo);
        } else {
            System.out.println("Unzureichendes Guthaben.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

public class BankkontoSimulation {
    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto(1000);
        konto1.einzahlen(200);
        konto1.abheben(150);
        System.out.println("Endguthaben: " + konto1.getSaldo());
    }
}
