package br.com.fiap.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.fiap.model.Empresa;


public class EmpresaDAO {
        private static String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        private static String user =  "rm93057";
        private static String password =  "020704";

        public void inserir(Empresa empresa) throws SQLException, IOException {
            Connection con = DriverManager.getConnection(url, user, password);
            
            var stmt = con.prepareStatement("INSERT INTO TB_SGC_EMP (nome_emp, telefone_emp, email_emp, cnpj, seguimento_empresarial, descricao_emp) "+
            "VALUES (?, ?, ?, ?, ?, ?)");
            
            
            
            stmt.setString(1, empresa.getNome_emp());
            stmt.setString(2, empresa.getTelefone_emp());
            stmt.setString(3, empresa.getEmail_emp());
            stmt.setString(4, empresa.getCnpj());
            stmt.setString(5, empresa.getSeguimento_empresarial());
            stmt.setString(6, empresa.getDescricao_emp());
           
            stmt.execute();
            con.close();
        }
    
}
