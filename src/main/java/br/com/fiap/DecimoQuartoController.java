package br.com.fiap;

import java.io.IOException;
import java.sql.SQLException;

import br.com.fiap.dao.VagasDAO;
import br.com.fiap.model.Vagas;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class DecimoQuartoController {

    @FXML
    TextField TituloVaga;
    @FXML
    TextField DescricaoVaga;
    @FXML
    TextField SalarioVaga;
    @FXML
    TextField QuantidadeVagas;

    private Vagas CarregarDadosVagas(){
        String titulovaga = TituloVaga.getText();
        String descricaovaga = DescricaoVaga.getText();
        String salariovaga = SalarioVaga.getText();
        String quantidadevagas = QuantidadeVagas.getText();

        return new Vagas(titulovaga, descricaovaga, salariovaga,quantidadevagas);
    }

    private void limparFormulario() {
        TituloVaga.setText("");
        DescricaoVaga.setText("");
        SalarioVaga.setText("");
        QuantidadeVagas.setText("");
      
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }
    
    @FXML
    public void ConcluirCadastroVagas(){
        try {
            new VagasDAO().inserir(CarregarDadosVagas());
            mostrarAlerta("Vaga cadatrada com sucesso");
            limparFormulario();
  
        } catch (SQLException e) {
            mostrarAlerta("Erro de conexao com BD " + e.getMessage());
        } catch (IOException e) {
            mostrarAlerta("Erro ao obter propriedades de conexão. Verifique arquivo application.properties. " + e.getMessage());
        }
      }

    @FXML
    public void VoltaraoMenu() throws IOException {
        App.setRoot("decimoterceiro");
    }
    
}
