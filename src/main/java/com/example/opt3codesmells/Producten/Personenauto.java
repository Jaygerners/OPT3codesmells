package com.example.opt3codesmells.Producten;

public class Personenauto extends Product {
    private int gewicht;

    @Override
    public boolean isVoorraad() {
        return false;
    }

    private int motorinhoud;

    public Personenauto(String merk, int gewicht, int motorinhoud) {
        super(merk);
        this.gewicht = gewicht;
        this.motorinhoud = motorinhoud;
    }

    @Override
    protected double basisHuurprijs() {
        return 50;
    }

    @Override
    protected double berekenVerzekeringskosten() {
        return 0.01 * motorinhoud;
    }
}

