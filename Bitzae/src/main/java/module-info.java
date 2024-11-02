module com.example.bitzae {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bitzae to javafx.fxml;
    exports com.example.bitzae;
}