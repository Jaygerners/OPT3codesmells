package com.example.opt3codesmells.Producten;

public class Boormachine extends Product {
    private String type;

    public Boormachine(String merk, String type) {
        super(merk);
        this.type = type;
    }

    @Override
    protected double basisHuurprijs() {
        return 5;
    }

    @Override
    protected double berekenVerzekeringskosten() {
        return 1;
    }
}
