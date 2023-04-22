package br.com.fiap.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.model.Curriculo;

public class CurriculoDAO {
        private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        private static String user =  "rm93057";
        private static String password =  "020704";

        public void inserir(Curriculo curriculo) throws SQLException, IOException {
            Connection con = DriverManager.getConnection(url, user, password);
            
            var stmt = con.prepareStatement("INSERT INTO TB_SGC_CURRIC (descricao_curric, exp_profissional, caracteristica_curriculo, proeficiencias_curriculo, idiomas_curriculo) "+
            "VALUES (?, ?, ?, ?, ?)");
            
            
            
            stmt.setString(1, curriculo.getDescricao_curric());
            stmt.setString(2, curriculo.getExp_profissional());
            stmt.setString(3, curriculo.getCaracteristica_curriculo());
            stmt.setString(4, curriculo.getProeficiencias_curriculo());
            stmt.setString(5, curriculo.getIdiomas_curriculo());
           
            stmt.execute();
            con.close();
        }
    
}
