package br.com.fiap.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.model.Vagas;


public class VagasDAO {
        private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        private static String user =  "rm93057";
        private static String password =  "020704";

        public void inserir(Vagas vagas) throws SQLException, IOException {
            Connection con = DriverManager.getConnection(url, user, password);
            
            var stmt = con.prepareStatement("INSERT INTO TB_SGC_VAGAS (titulo_vaga, descricao_vaga, salario_vaga, quantidade_vagas) "+
            "VALUES (?, ?, ?, ?)");
            
            
            
            stmt.setString(1, vagas.getTitulo_vaga());
            stmt.setString(2, vagas.getDescricao_vaga());
            stmt.setString(3, vagas.getSalario_vaga());
            stmt.setString(4, vagas.getQuantidade_vagas());
           
            stmt.execute();
            con.close();
        }

    
}
