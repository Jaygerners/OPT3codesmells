package com.example.opt3codesmells.Producten;

// Abstracte klasse voor het product
public abstract class Product {
    private String merk;

    public Product(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    // Sjabloonmethode voor het berekenen van de huurprijs
    public final double berekenHuurprijs(int aantalDagen) {
        double huurprijs = basisHuurprijs() * aantalDagen;
        double verzekeringskosten = berekenVerzekeringskosten() * aantalDagen;

        return huurprijs + verzekeringskosten;
    }

    // Abstracte methoden die door de subklassen geïmplementeerd moeten worden
    protected abstract double basisHuurprijs();
    protected abstract double berekenVerzekeringskosten();
}

