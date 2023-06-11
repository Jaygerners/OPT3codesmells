package com.example.opt3codesmells;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class MenuVenster implements Subject {
    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {
    }
    private List<VensterObserver> observers = new ArrayList<>();
    public void addObserver(VensterObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(VensterObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers(int aantalGeopendeVensters) {
        for (VensterObserver observer : observers) {
            observer.update(aantalGeopendeVensters);
        }
    }

}

