package com.example.opt3codesmells.Factory;

import com.example.opt3codesmells.Producten.Boormachine;
import com.example.opt3codesmells.Producten.Product;

public class BoormachineFactory extends ProductFactory {
    private String merk;
    private String type;

    public BoormachineFactory(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    @Override
    public Product createProduct() {
        return new Boormachine(merk, type);
    }
}
