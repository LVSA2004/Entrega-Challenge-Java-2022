package br.com.fiap;

import java.io.IOException;
import java.sql.SQLException;

import br.com.fiap.dao.CandidatoDAO;
import br.com.fiap.model.Candidato;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class SecondaryController {
    @FXML
    TextField NomeCompleto;
    @FXML
    TextField Telefone;
    @FXML
    TextField Email;
    @FXML
    TextField Endereco;
    @FXML
    TextField DataDeNascimento;
    @FXML
    TextField LoginCandidato;
    @FXML
    TextField SenhaCandidato;

    private Candidato CarregarDadosCandidato(){
        String nome = NomeCompleto.getText();
        String telefone = Telefone.getText();
        String email = Email.getText();
        String endereco = Endereco.getText();
        String datanascimento = DataDeNascimento.getText();
        String login = LoginCandidato.getText();
        String senha = SenhaCandidato.getText();

        return new Candidato(nome, telefone, email, endereco, datanascimento, login, senha);
    }
    private void limparFormulario() {
        NomeCompleto.setText("");
        Telefone.setText("");
        Email.setText("");
        Endereco.setText("");
        DataDeNascimento.setText("");
        LoginCandidato.setText("");
        SenhaCandidato.setText("");
      
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }

    @FXML
    public void ConcluirCadastroCandidato(){
        try {
            new CandidatoDAO().inserir(CarregarDadosCandidato());
            mostrarAlerta("Candidato cadatrado com sucesso");
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
    
}