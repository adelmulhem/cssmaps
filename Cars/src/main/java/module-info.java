module com.example.cars {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.cars to javafx.fxml;
    exports com.example.cars;
}