module UD2JavaFXEjemplo
{
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports es.pablo;
    exports es.pablo.logica;
    exports es.pablo.views;
    exports es.pablo.models;

    opens es.pablo.views to javafx.fxml;

}