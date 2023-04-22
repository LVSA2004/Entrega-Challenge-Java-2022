package br.com.fiap.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.model.Candidato;

public class CandidatoDAO{
        private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        private static String user =  "rm93057";
        private static String password =  "020704";

    public void inserir(Candidato candidato) throws SQLException, IOException {
        Connection con = DriverManager.getConnection(url, user, password);
        
        var stmt = con.prepareStatement("INSERT INTO TB_SGC_CAND (nome_cand, telefone_cand, email_candidato, endereco_candidato, data_nascimento, login_candidato, senha_candidato) "+
        "VALUES (?, ?, ?, ?, ?, ?, ?)");
        
        
        
        stmt.setString(1, candidato.getNome_cand());
        stmt.setString(2, candidato.getTelefone_cand());
        stmt.setString(3, candidato.getEmail_candidato());
        stmt.setString(4, candidato.getEndereco_candidato());
        stmt.setString(5, candidato.getData_nascimento());
        stmt.setString(6, candidato.getLogin_candidato());
        stmt.setString(7, candidato.getSenha_candidato());
       
        stmt.execute();
        con.close();
    }
    
}