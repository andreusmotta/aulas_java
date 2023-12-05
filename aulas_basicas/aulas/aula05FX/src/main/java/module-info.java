module aulajava.aula05fx {
    requires javafx.controls;
    requires javafx.fxml;

    opens aulajava.aula05fx to javafx.fxml;
    exports aulajava.aula05fx;
}
