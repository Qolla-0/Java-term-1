module com.example.lab7 {
    requires javafx.controls;
    requires javafx.fxml;
    exports main.lashukolga231;

    requires org.controlsfx.controls;

    opens com.example.lab7 to javafx.fxml;
    exports com.example.lab7;
}