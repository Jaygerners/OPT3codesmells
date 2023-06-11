package com.example.opt3codesmells.Controller;
import com.example.opt3codesmells.Controller.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

import static com.example.opt3codesmells.Controller.Controller.openScene;

public class MenuController {

    @FXML
    private void openOverzicht(ActionEvent event) throws IOException {
        // Code om het overzichtvenster te openen
        FXMLLoader fxmlLoader = new FXMLLoader();
        openScene("Overzichtvenster.fxml");
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