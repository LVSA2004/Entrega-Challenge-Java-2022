package br.com.fiap.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.model.Experiencia;

public class ExperienciaDAO {
        private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        private static String user =  "rm93057";
        private static String password =  "020704";

        public void inserir(Experiencia experiencia) throws SQLException, IOException {
            Connection con = DriverManager.getConnection(url, user, password);
            
            var stmt = con.prepareStatement("INSERT INTO TB_SGC_EXP (data_inicio, data_fim, cargo, descricao_exp) "+
            "VALUES (?, ?, ?, ?)");
            
            stmt.setString(1, experiencia.getData_inicio());
            stmt.setString(2, experiencia.getData_fim());
            stmt.setString(3, experiencia.getCargo());
            stmt.setString(4, experiencia.getDescricao_exp());
           
            stmt.execute();
            con.close();
        }
    
}
