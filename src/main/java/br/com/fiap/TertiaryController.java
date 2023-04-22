package br.com.fiap;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import br.com.fiap.dao.FuncionarioDAO;
import br.com.fiap.model.Funcionario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class TertiaryController implements Initializable{

    @FXML
    TextField NomeCompleto;
    @FXML
    TextField Email;
    @FXML
    TextField Descricao;
    @FXML
    TextField LoginFuncionario;
    @FXML
    TextField SenhaFuncionario;

    private Funcionario CarregarDadosFuncionario(){
        String nome = NomeCompleto.getText();
        String email = Email.getText();
        String descricao = Descricao.getText();
        String login = LoginFuncionario.getText();
        String senha = SenhaFuncionario.getText();

        return new Funcionario(nome, email, descricao, login, senha);
    }

    private void limparFormulario() {
        NomeCompleto.setText("");
        Email.setText("");
        Descricao.setText("");
        LoginFuncionario.setText("");
        SenhaFuncionario.setText("");
      
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }

    @FXML
    public void ConcluirCadastroFuncionario(){
        try {
            new FuncionarioDAO().inserir(CarregarDadosFuncionario());
            mostrarAlerta("Funcionário cadatrado com sucesso");
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
