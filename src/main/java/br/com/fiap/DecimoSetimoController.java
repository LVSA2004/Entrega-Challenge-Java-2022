package br.com.fiap;

import java.io.IOException;

import javafx.fxml.FXML;

public class DecimoSetimoController {

    @FXML
    public void MostrarVagas() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    public void CadastrarExp() throws IOException {
        App.setRoot("decimooitavo");
    }
    
}
