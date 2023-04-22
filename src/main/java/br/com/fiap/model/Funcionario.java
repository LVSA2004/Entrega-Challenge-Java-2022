package br.com.fiap.model;

public class Funcionario {
    private static String nome_funci;
    private static String email_funci;
    private static String descricao_funci;
    private static String login_funci;
    private static String senha_funci;
    
    public Funcionario(String nome_funci, String email_funci, String descricao_funci, String login_funci,
            String senha_funci) {
        Funcionario.nome_funci = nome_funci;
        Funcionario.email_funci = email_funci;
        Funcionario.descricao_funci = descricao_funci;
        Funcionario.login_funci = login_funci;
        Funcionario.senha_funci = senha_funci;
    }
    
    public String getNome_funci() {
        return nome_funci;
    }
    public void setNome_funci(String nome_funci) {
        Funcionario.nome_funci = nome_funci;
    }
    public String getEmail_funci() {
        return email_funci;
    }
    public void setEmail_funci(String email_funci) {
        Funcionario.email_funci = email_funci;
    }
    public String getDescricao_funci() {
        return descricao_funci;
    }
    public void setDescricao_funci(String descricao_funci) {
        Funcionario.descricao_funci = descricao_funci;
    }
    public String getLogin_funci() {
        return login_funci;
    }
    public void setLogin_funci(String login_funci) {
        Funcionario.login_funci = login_funci;
    }
    public String getSenha_funci() {
        return senha_funci;
    }
    public void setSenha_funci(String senha_funci) {
        Funcionario.senha_funci = senha_funci;
    }

    @Override
    public String toString() {
        return "Funcionario [nome_funci=" + nome_funci + ", email_funci=" + email_funci + ", descricao_funci="
                + descricao_funci + ", login_funci=" + login_funci + ", senha_funci=" + senha_funci + "]";
    }
}
