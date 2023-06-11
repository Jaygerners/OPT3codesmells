package com.example.opt3codesmells;




public class VensterObserver implements Observer {
    private int aantalGeopendeVensters;


    public void update(int aantalGeopendeVensters) {
    this.aantalGeopendeVensters = aantalGeopendeVensters;
    showGetal();
    }

    public void showGetal() {
        System.out.println("Aantal geopende menuvensters: " + aantalGeopendeVensters);
    }
}