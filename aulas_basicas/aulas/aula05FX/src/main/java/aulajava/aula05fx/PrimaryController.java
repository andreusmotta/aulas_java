package aulajava.aula05fx;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private Label lblMensagem;
    private Button btnClick;
    
    public void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá, Mundo!");
    }
    
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
