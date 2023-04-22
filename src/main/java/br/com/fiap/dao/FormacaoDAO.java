package br.com.fiap.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.model.Formacao;

public class FormacaoDAO {
        private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        private static String user =  "rm93057";
        private static String password =  "020704";

    public void inserir(Formacao formacao) throws SQLException, IOException {
        Connection con = DriverManager.getConnection(url, user, password);
        
        var stmt = con.prepareStatement("INSERT INTO TB_SGC_FORMACAO (data_inicio_formacao, data_fim_formacao, nome_formacao) "+
        "VALUES (?, ?, ?)");
        
        stmt.setString(1, formacao.getData_inicio_formacao());
        stmt.setString(2, formacao.getData_fim_formacao());
        stmt.setString(3, formacao.getNome_formacao());
       
        stmt.execute();
        con.close();
    }
    
}
