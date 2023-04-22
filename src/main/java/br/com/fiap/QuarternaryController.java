package br.com.fiap;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import br.com.fiap.dao.AvaliadorDAO;
import br.com.fiap.model.Avaliador;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class QuarternaryController implements Initializable{

    @FXML
    TextField NomeCompleto;
    @FXML
    TextField Email;
    @FXML
    TextField LoginAvaliador;
    @FXML
    TextField SenhaAvaliador;
    @FXML
    TextField EmpresaContratante;

    private Avaliador CarregarDadosAvaliador(){
        String nome = NomeCompleto.getText();
        String email = Email.getText();
        String login = LoginAvaliador.getText();
        String senha = SenhaAvaliador.getText();
        String empresa = EmpresaContratante.getText();

        return new Avaliador(nome, email, login, senha, empresa);
    }
    private void limparFormulario() {
        NomeCompleto.setText("");
        Email.setText("");
        LoginAvaliador.setText("");
        SenhaAvaliador.setText("");
        EmpresaContratante.setText("");
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }

    @FXML
    public void ConcluirCadastroAvaliador(){
        try {
            new AvaliadorDAO().inserir(CarregarDadosAvaliador());
            mostrarAlerta("Avaliador cadatrado com sucesso");
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
