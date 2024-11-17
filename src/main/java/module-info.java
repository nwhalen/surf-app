module nwhalen.surfapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens nwhalen.surfapp to javafx.fxml;
    exports nwhalen.surfapp;
}