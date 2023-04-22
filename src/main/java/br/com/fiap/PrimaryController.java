package br.com.fiap;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class PrimaryController implements Initializable{

    @FXML
    private void cadastrarCandidato() throws IOException {
        App.setRoot("secondary");
    }
    public void cadastrarFuncionario() throws IOException{
        App.setRoot("tertiary");
    }
    public void cadastrarAvaliador() throws IOException{
        App.setRoot("quarternary");
    }
    public void cadastrarAdministrador() throws IOException{
        App.setRoot("quinto");
    }

    public void loginCandidato() throws IOException{
        App.setRoot("sexto");
    }
    public void loginFuncionario() throws IOException{
        App.setRoot("setimo");
    }
    public void loginAvaliador() throws IOException{
        App.setRoot("oitavo");
    }
    public void loginAdministrador() throws IOException{
        App.setRoot("nono");
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

   
}
