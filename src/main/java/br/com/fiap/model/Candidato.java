package br.com.fiap.model;

public class Candidato {
    private static String nome_cand;
    private static String telefone_cand;
    private static String email_candidato;
    private static String endereco_candidato;
    private static String data_nascimento;
    private static String login_candidato;
    private static String senha_candidato;
    
    public Candidato(String nome_cand, String telefone_cand, String email_candidato, String endereco_candidato,
            String data_nascimento, String login_candidato, String senha_candidato) {
        Candidato.nome_cand = nome_cand;
        Candidato.telefone_cand = telefone_cand;
        Candidato.email_candidato = email_candidato;
        Candidato.endereco_candidato = endereco_candidato;
        Candidato.data_nascimento = data_nascimento;
        Candidato.login_candidato = login_candidato;
        Candidato.senha_candidato = senha_candidato;
    }

    public String getNome_cand() {
        return nome_cand;
    }
    public void setNome_cand(String nome_cand) {
        Candidato.nome_cand = nome_cand;
    }
    public String getTelefone_cand() {
        return telefone_cand;
    }
    public void setTelefone_cand(String telefone_cand) {
        Candidato.telefone_cand = telefone_cand;
    }
    public String getEmail_candidato() {
        return email_candidato;
    }
    public void setEmail_candidato(String email_candidato) {
        Candidato.email_candidato = email_candidato;
    }
    public String getEndereco_candidato() {
        return endereco_candidato;
    }
    public void setEndereco_candidato(String endereco_candidato) {
        Candidato.endereco_candidato = endereco_candidato;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento) {
        Candidato.data_nascimento = data_nascimento;
    }
    public String getLogin_candidato() {
        return login_candidato;
    }
    public void setLogin_candidato(String login_candidato) {
        Candidato.login_candidato = login_candidato;
    }
    public String getSenha_candidato() {
        return senha_candidato;
    }
    public void setSenha_candidato(String senha_candidato) {
        Candidato.senha_candidato = senha_candidato;
    }

    @Override
    public String toString() {
        return "Candidato [nome_cand=" + nome_cand + ", telefone_cand=" + telefone_cand + ", email_candidato="
                + email_candidato + ", endereco_candidato=" + endereco_candidato + ", data_nascimento="
                + data_nascimento + ", login_candidato=" + login_candidato + ", senha_candidato=" + senha_candidato
                + "]";
    }
    
    
    
}
