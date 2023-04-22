package br.com.fiap;

import java.io.IOException;

import javafx.fxml.FXML;

public class DecimoTerceiroController {

    @FXML
    public void CadastrarVagas() throws IOException {
        App.setRoot("decimoquarto");
    }
    @FXML
    public void CadastrarExperiencias() throws IOException {
        App.setRoot("decimoquinto");
    }
    @FXML
    public void CadastrarEmpresas() throws IOException {
        App.setRoot("decimosexto");
    }
    
}
