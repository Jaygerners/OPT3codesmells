package com.example.opt3codesmells;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private void openOverzicht(ActionEvent event) {
        // Code om het overzichtvenster te openen
        System.out.println("Overzichtvenster.fxml geopend");
    }

    @FXML
    private void openBeheer(ActionEvent event) {
        // Code om het beheervenster te openen
        System.out.println("Beheervenster geopend");
    }

    @FXML
    private void uitloggen(ActionEvent event) {
        // Code om uit te loggen en het menuvenster te sluiten
        System.out.println("Uitgelogd");
        // Hier kun je de benodigde logica toevoegen om het menuvenster te sluiten
    }
}