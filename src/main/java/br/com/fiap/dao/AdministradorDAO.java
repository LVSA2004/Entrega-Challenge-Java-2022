package br.com.fiap.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.model.Administrador;

public class AdministradorDAO{
    private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static String user =  "rm93057";
    private static String password =  "020704";

    public void inserir(Administrador administrador) throws SQLException, IOException {
        Connection con = DriverManager.getConnection(url, user, password);
        
        var stmt = con.prepareStatement ("INSERT INTO TB_SGC_ADM(nome_adm, email_adm, login_adm, senha_adm) "+
        "VALUES( ?, ?, ?, ?)");
        
        stmt.setString(1, administrador.getNome_adm());
        stmt.setString(2, administrador.getEmail_adm());
        stmt.setString(3, administrador.getLogin_adm());
        stmt.setString(4, administrador.getSenha_adm());
       
        stmt.execute();
        con.close();
    }
    
    }
