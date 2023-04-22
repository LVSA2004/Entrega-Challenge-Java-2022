package br.com.fiap.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

import br.com.fiap.model.Avaliador;


public class AvaliadorDAO{
        private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        private static String user =  "rm93057";
        private static String password =  "020704";
    
    public void inserir(Avaliador avaliador) throws SQLException, IOException {
        Connection con = DriverManager.getConnection(url, user, password);
        
        var stmt = con.prepareStatement ("INSERT INTO TB_SGC_AVAL (nome_avaliador, email_avaliador, login_avaliador, senha_avaliador, empresa_contratante) "+
        "VALUES(?, ?, ?, ?, ?)");
        
        stmt.setString(1, avaliador.getNome_avaliador());
        stmt.setString(2, avaliador.getEmail_avaliador());
        stmt.setString(3, avaliador.getEmpresa_contratante());
        stmt.setString(4, avaliador.getLogin_avaliador());
        stmt.setString(5, avaliador.getSenha_avaliador());
       
        stmt.execute();
        con.close();
}
}
