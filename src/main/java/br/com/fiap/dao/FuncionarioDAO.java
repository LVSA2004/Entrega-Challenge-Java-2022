package br.com.fiap.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.model.Funcionario;

public class FuncionarioDAO{
        private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        private static String user =  "rm93057";
        private static String password =  "020704";
    
    public void inserir(Funcionario funcionario) throws SQLException, IOException {
        Connection con = DriverManager.getConnection(url, user, password);
        
        var stmt = con.prepareStatement ("INSERT INTO TB_SGC_FUNCI(nome_funci, email_funci, descricao_funci, login_funci, senha_funci) "+
        "VALUES( ?, ?, ?, ?, ?)");
        
        stmt.setString(1, funcionario.getNome_funci());
        stmt.setString(2, funcionario.getEmail_funci());
        stmt.setString(3, funcionario.getDescricao_funci());
        stmt.setString(4, funcionario.getLogin_funci());
        stmt.setString(5, funcionario.getSenha_funci());

        stmt.execute();
        con.close();
    }
    
}
