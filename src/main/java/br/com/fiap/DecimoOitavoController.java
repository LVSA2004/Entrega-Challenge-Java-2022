package br.com.fiap;

import java.io.IOException;
import java.sql.SQLException;

import br.com.fiap.dao.ExperienciaDAO;
import br.com.fiap.model.Experiencia;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class DecimoOitavoController {

    @FXML
    TextField DataInicio;
    @FXML
    TextField DataFim;
    @FXML
    TextField Cargo;
    @FXML
    TextField Descricao;

    private Experiencia CarregarDadosExp(){
        String datainicio = DataInicio.getText();
        String datafim = DataFim.getText();
        String cargo = Cargo.getText();
        String descricao = Descricao.getText();

        return new Experiencia(datainicio, datafim, cargo,descricao);
    }

    private void limparFormulario() {
        DataInicio.setText("");
        DataFim.setText("");
        Cargo.setText("");
        Descricao.setText("");
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }
    
    @FXML
    public void ConcluirCadastroExp(){
        try {
            new ExperienciaDAO().inserir(CarregarDadosExp());
            mostrarAlerta("Experiência cadatrada com sucesso");
            limparFormulario();
  
        } catch (SQLException e) {
            mostrarAlerta("Erro de conexao com BD " + e.getMessage());
        } catch (IOException e) {
            mostrarAlerta("Erro ao obter propriedades de conexão. Verifique arquivo application.properties. " + e.getMessage());
        }
      }

    @FXML
    public void VoltaraoMenu() throws IOException {
        App.setRoot("decimosetimo");
    }
    
}
