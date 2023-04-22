package br.com.fiap.model;

public class Administrador {
    private static String nome_adm;
    private static String email_adm;
    private static String login_adm;
    private static String senha_adm;
    
    public Administrador(String nome_adm, String email_adm, String login_adm, String senha_adm) {
        Administrador.nome_adm = nome_adm;
        Administrador.email_adm = email_adm;
        Administrador.login_adm = login_adm;
        Administrador.senha_adm = senha_adm;
    }

    public String getNome_adm() {
        return nome_adm;
    }
    public void setNome_adm(String nome_adm) {
        Administrador.nome_adm = nome_adm;
    }
    public String getEmail_adm() {
        return email_adm;
    }
    public void setEmail_adm(String email_adm) {
        Administrador.email_adm = email_adm;
    }
    public String getLogin_adm() {
        return login_adm;
    }
    public void setLogin_adm(String login_adm) {
        Administrador.login_adm = login_adm;
    }
    public String getSenha_adm() {
        return senha_adm;
    }
    public void setSenha_adm(String senha_adm) {
        Administrador.senha_adm = senha_adm;
    }

    @Override
    public String toString() {
        return "Administrador [nome_adm=" + nome_adm + ", email_adm=" + email_adm + ", login_adm=" + login_adm
                + ", senha_adm=" + senha_adm + "]";
    }  
}
