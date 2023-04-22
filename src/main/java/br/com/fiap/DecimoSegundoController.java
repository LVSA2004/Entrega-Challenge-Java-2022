package br.com.fiap;

import java.io.IOException;
import java.sql.SQLException;

import br.com.fiap.dao.FormacaoDAO;
import br.com.fiap.model.Formacao;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class DecimoSegundoController {

    @FXML
    TextField DataInicio;
    @FXML
    TextField DataFim;
    @FXML
    TextField Nome;

    private Formacao CarregarDadosFormacao(){
        String datainicio = DataInicio.getText();
        String datafim = DataFim.getText();
        String nome = Nome.getText();

        return new Formacao(datainicio, datafim, nome);
    }

    private void limparFormulario() {
        DataInicio.setText("");
        DataFim.setText("");
        Nome.setText("");
      
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }
    
    @FXML
    public void ConcluirCadastroFormacao(){
        try {
            new FormacaoDAO().inserir(CarregarDadosFormacao());
            mostrarAlerta("Formação cadatrada com sucesso");
            limparFormulario();
  
        } catch (SQLException e) {
            mostrarAlerta("Erro de conexao com BD " + e.getMessage());
        } catch (IOException e) {
            mostrarAlerta("Erro ao obter propriedades de conexão. Verifique arquivo application.properties. " + e.getMessage());
        }
      }

    @FXML
    public void VoltaraoMenu() throws IOException {
        App.setRoot("decimo");
    }
    
}
