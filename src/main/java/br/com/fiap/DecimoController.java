package br.com.fiap;

import java.io.IOException;

import javafx.fxml.FXML;

public class DecimoController {
    @FXML
    public void CadastrarCurriculo() throws IOException {
        App.setRoot("decimoprimeiro");
    }
    @FXML
    public void CadastrarFormacao() throws IOException {
        App.setRoot("decimosegundo");
    }
    
}
