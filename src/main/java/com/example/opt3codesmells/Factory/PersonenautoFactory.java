package com.example.opt3codesmells.Factory;

import com.example.opt3codesmells.Producten.Personenauto;
import com.example.opt3codesmells.Producten.Product;

public class PersonenautoFactory extends ProductFactory {
    private String merk;
    private int gewicht;
    private int motorinhoud;

    public PersonenautoFactory(String merk, int gewicht, int motorinhoud) {
        this.merk = merk;
        this.gewicht = gewicht;
        this.motorinhoud = motorinhoud;
    }

    @Override
    public Product createProduct() {
        return new Personenauto(merk, gewicht, motorinhoud);
    }
}