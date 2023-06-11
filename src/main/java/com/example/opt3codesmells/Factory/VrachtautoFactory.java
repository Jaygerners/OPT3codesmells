package com.example.opt3codesmells.Factory;

import com.example.opt3codesmells.Producten.Product;
import com.example.opt3codesmells.Producten.Vrachtauto;

public class VrachtautoFactory extends ProductFactory {
    private String merk;
    private int laadvermogen;
    private int motorinhoud;

    public VrachtautoFactory(String merk, int laadvermogen, int motorinhoud) {
        this.merk = merk;
        this.laadvermogen = laadvermogen;
        this.motorinhoud = motorinhoud;
    }

    @Override
    public Product createProduct() {
        return new Vrachtauto(merk, laadvermogen, motorinhoud);
    }
}

