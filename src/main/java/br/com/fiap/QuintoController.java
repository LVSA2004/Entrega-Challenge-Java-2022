package br.com.fiap;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import br.com.fiap.dao.AdministradorDAO;
import br.com.fiap.model.Administrador;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;


public class QuintoController implements Initializable{

    @FXML
    TextField NomeCompleto;
    @FXML
    TextField Email;
    @FXML
    TextField LoginAdm;
    @FXML
    TextField SenhaAdm;

    private Administrador CarregarDadosAdministrador(){
        String nome = NomeCompleto.getText();
        String email = Email.getText();
        String login = LoginAdm.getText();
        String senha = SenhaAdm.getText();

        return new Administrador(nome, email, login, senha);
    }

    private void limparFormulario() {
        NomeCompleto.setText("");
        Email.setText("");
        LoginAdm.setText("");
        SenhaAdm.setText("");
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }

    @FXML
    public void ConcluirCadastroAdministrador(){
        try {
            new AdministradorDAO().inserir(CarregarDadosAdministrador());
            mostrarAlerta("Administrador cadatrado com sucesso");
            limparFormulario();
  
        } catch (SQLException e) {
            mostrarAlerta("Erro de conexao com BD " + e.getMessage());
        } catch (IOException e) {
            mostrarAlerta("Erro ao obter propriedades de conexão. Verifique arquivo application.properties. " + e.getMessage());
        }
      }

    @FXML
    public void VoltaraoMenu() throws IOException {
        App.setRoot("primary");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }
    
}
