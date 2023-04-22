package br.com.fiap;

import java.io.IOException;
import java.sql.SQLException;

import br.com.fiap.dao.CurriculoDAO;
import br.com.fiap.model.Curriculo;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class DecimoPrimeiroController {
    @FXML
    TextField Descricao;
    @FXML
    TextField Exp;
    @FXML
    TextField Caracteristicas;
    @FXML
    TextField Proeficiencias;
    @FXML
    TextField Idiomas;

    private Curriculo CarregarDadosCurriculo(){
        String descricao = Descricao.getText();
        String exp = Exp.getText();
        String caracteristicas = Caracteristicas.getText();
        String proeficiencias = Proeficiencias.getText();
        String idiomas = Idiomas.getText();

        return new Curriculo(descricao, exp, caracteristicas, proeficiencias, idiomas);
    }
    private void limparFormulario() {
        Descricao.setText("");
        Exp.setText("");
        Caracteristicas.setText("");
        Proeficiencias.setText("");
        Idiomas.setText("");
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }
    @FXML
    public void ConcluirCadastroCurriculo(){
        try {
            new CurriculoDAO().inserir(CarregarDadosCurriculo());
            mostrarAlerta("Curriculo cadatrado com sucesso");
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
