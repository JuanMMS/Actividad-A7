module uniquindio.programamusica {
    requires javafx.controls;
    requires javafx.fxml;


    opens uniquindio.programamusica to javafx.fxml;
    exports uniquindio.programamusica;
}