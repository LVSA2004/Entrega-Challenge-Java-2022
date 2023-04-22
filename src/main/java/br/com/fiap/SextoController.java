package br.com.fiap;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SextoController {

    @FXML
    TextField Login;
    @FXML
    PasswordField Senha;

    @FXML
    public void VoltaraoMenu() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    public void LoginCandidato() throws IOException {
        App.setRoot("decimo");
    }
    
}
