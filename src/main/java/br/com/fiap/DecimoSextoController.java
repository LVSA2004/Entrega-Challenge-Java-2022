package br.com.fiap;

import java.io.IOException;
import java.sql.SQLException;

import br.com.fiap.dao.EmpresaDAO;
import br.com.fiap.model.Empresa;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class DecimoSextoController {

    @FXML
    TextField NomeEmp;
    @FXML
    TextField TelefoneEmp;
    @FXML
    TextField EmailEmp;
    @FXML
    TextField Cnpj;
    @FXML
    TextField SeguimentoEmpresarial;
    @FXML
    TextField DescricaoEmp;

    private Empresa CarregarDadosEmp(){
        String nomeemp = NomeEmp.getText();
        String telefoneemp = TelefoneEmp.getText();
        String emailemp = EmailEmp.getText();
        String cnpj = Cnpj.getText();
        String seguimentoempresarial = SeguimentoEmpresarial.getText();
        String descricaoemp = DescricaoEmp.getText();

        return new Empresa(nomeemp, telefoneemp, emailemp,cnpj, seguimentoempresarial, descricaoemp);
    }

    private void limparFormulario() {
        NomeEmp.setText("");
        TelefoneEmp.setText("");
        EmailEmp.setText("");
        Cnpj.setText("");
        SeguimentoEmpresarial.setText("");
        DescricaoEmp.setText("");
      
    }

    private void mostrarAlerta(String mensagem) {
        var alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(mensagem);
        alert.show();
    }
    
    @FXML
    public void ConcluirCadastroEmp(){
        try {
            new EmpresaDAO().inserir(CarregarDadosEmp());
            mostrarAlerta("Empresa cadatrada com sucesso");
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
