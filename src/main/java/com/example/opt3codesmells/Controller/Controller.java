package com.example.opt3codesmells.Controller;

import com.example.opt3codesmells.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.example.opt3codesmells.Controller.OverzichtController;

import java.io.IOException;

public class Controller {

    public static void openScene(String FXML) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(FXML+".fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(FXML);
        stage.setScene(scene);
        stage.show();
    }
    public static void closeScene(String FXML) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(FXML+".fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.close();
    }
}
