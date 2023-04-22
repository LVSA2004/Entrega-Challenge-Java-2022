package br.com.fiap.model;

public class Avaliador {
    private static String nome_avaliador;
    private static String email_avaliador;
    private static String login_avaliador;
    private static String senha_avaliador;
    private static String empresa_contratante;
    
    public Avaliador(String nome_avaliador, String email_avaliador, String login_avaliador, String senha_avaliador, String empresa_contratante) {
        Avaliador.nome_avaliador = nome_avaliador;
        Avaliador.email_avaliador = email_avaliador;
        Avaliador.login_avaliador = login_avaliador;
        Avaliador.senha_avaliador = senha_avaliador;
        Avaliador.empresa_contratante = empresa_contratante;
    }
    
    public String getNome_avaliador() {
        return nome_avaliador;
    }
    public void setNome_avaliador(String nome_avaliador) {
        Avaliador.nome_avaliador = nome_avaliador;
    }
    public String getEmail_avaliador() {
        return email_avaliador;
    }
    public void setEmail_avaliador(String email_avaliador) {
        Avaliador.email_avaliador = email_avaliador;
    }
    public String getLogin_avaliador() {
        return login_avaliador;
    }
    public void setLogin_avaliador(String login_avaliador) {
        Avaliador.login_avaliador = login_avaliador;
    }
    public String getSenha_avaliador() {
        return senha_avaliador;
    }
    public void setSenha_avaliador(String senha_avaliador) {
        Avaliador.senha_avaliador = senha_avaliador;
    }
    public String getEmpresa_contratante() {
        return empresa_contratante;
    }
    public void setEmpresa_contratante(String empresa_contratante) {
        Avaliador.empresa_contratante = empresa_contratante;
    }

    @Override
    public String toString() {
        return "Avaliador [nome_avaliador=" + nome_avaliador + ", email_avaliador=" + email_avaliador
                + ", login_avaliador=" + login_avaliador
                + ", senha_avaliador=" + senha_avaliador + ", empresa_contratante=" + empresa_contratante +"]";
    }
    
}
