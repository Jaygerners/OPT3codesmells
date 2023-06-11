package com.example.opt3codesmells.Producten;

public class Vrachtauto extends Product {
    private int laadvermogen;
    private int motorinhoud;

    public Vrachtauto(String merk, int laadvermogen, int motorinhoud) {
        super(merk);
        this.laadvermogen = laadvermogen;
        this.motorinhoud = motorinhoud;
    }

    @Override
    protected double basisHuurprijs() {
        return 0.10 * laadvermogen;
    }

    @Override
    protected double berekenVerzekeringskosten() {
        return 0.01 * motorinhoud;
    }
}

