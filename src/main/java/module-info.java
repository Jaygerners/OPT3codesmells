module com.example.opt3codesmells {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.opt3codesmells to javafx.fxml;
    exports com.example.opt3codesmells;
    exports com.example.opt3codesmells.Controller;
    opens com.example.opt3codesmells.Controller to javafx.fxml;
}