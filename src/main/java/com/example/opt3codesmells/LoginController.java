package com.example.opt3codesmells;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.opt3codesmells.MenuVenster.*;

public class LoginController {
    @FXML
    private Label aantalSchermen;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML private javafx.scene.control.Button closeButton;
    private static int menus = 0;

    @FXML
    private void onButtonClick(ActionEvent event) throws IOException {
        if(usernameField.getText().equals("jay") && passwordField.getText().equals("jay")){
            menus++;
            String menusAsString = Integer.toString(menus);
            openScene("Menuvenster");
            MenuVenster menuVenster = new MenuVenster();
            menuVenster.notifyObservers(menus);
            aantalSchermen.setText(menusAsString);
            usernameField.setText("");passwordField.setText("");
        }
    }
    @FXML
    private void closeButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    }