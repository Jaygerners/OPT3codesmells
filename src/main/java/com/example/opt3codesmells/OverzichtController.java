package com.example.opt3codesmells;
import com.example.opt3codesmells.Factory.BoormachineFactory;
import com.example.opt3codesmells.Factory.PersonenautoFactory;
import com.example.opt3codesmells.Factory.ProductFactory;
import com.example.opt3codesmells.Factory.VrachtautoFactory;
import com.example.opt3codesmells.Producten.Product;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class OverzichtController implements Initializable {

    @FXML
    private VBox productList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Vul hier de producten in en voeg ze toe aan de productList VBox

        // Voorbeeldproducten
        ProductFactory autoFactory = new PersonenautoFactory("Mercedes", 1500, 2000);
        ProductFactory vrachtautoFactory = new VrachtautoFactory("Scania", 5000, 8000);
        ProductFactory boormachineFactory = new BoormachineFactory("Bosch", "Boor123");

        // Producten toevoegen aan de productList VBox
        productList.getChildren().addAll(createProductLabel(product1), createProductLabel(product2), createProductLabel(product3));
    }

    // Methode om een Label voor een product te maken
    private Label createProductLabel(Product product) {
        Label label = new Label(product.getNaam());
        if (product.isVoorraad()) {
            label.setStyle("-fx-text-fill: green;");
        } else {
            label.setStyle("-fx-text-fill: red;");
        }
        label.setOnMouseClicked(event -> openDetailVenster(product));
        return label;
    }

    // Methode om het detailvenster te openen voor een specifiek product
    private void openDetailVenster(Product product) {
        // Implementeer hier de logica om het detailvenster te openen voor het geselecteerde product
        System.out.println("Detailvenster openen voor product: " + product.getNaam());
    }
}
