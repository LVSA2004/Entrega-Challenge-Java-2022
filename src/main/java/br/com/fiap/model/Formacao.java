package br.com.fiap.model;

public class Formacao {
    private static String data_inicio_formacao;
    private static String data_fim_formacao;
    private static String nome_formacao;
    
    public Formacao(String data_inicio_formacao, String data_fim_formacao, String nome_formacao) {
        Formacao.data_inicio_formacao = data_inicio_formacao;
        Formacao.data_fim_formacao = data_fim_formacao;
        Formacao.nome_formacao = nome_formacao;
    }

    public String getData_inicio_formacao() {
        return data_inicio_formacao;
    }
    public void setData_inicio_formacao(String data_inicio_formacao) {
        Formacao.data_inicio_formacao = data_inicio_formacao;
    }
    public String getData_fim_formacao() {
        return data_fim_formacao;
    }
    public void setData_fim_formacao(String data_fim_formacao) {
        Formacao.data_fim_formacao = data_fim_formacao;
    }
    public String getNome_formacao() {
        return nome_formacao;
    }
    public void setNome_formacao(String nome_formacao) {
        Formacao.nome_formacao = nome_formacao;
    }

    @Override
    public String toString() {
        return "Formacao [data_inicio_formacao=" + data_inicio_formacao + ", data_fim_formacao=" + data_fim_formacao
                + ", nome_formacao=" + nome_formacao + "]";
    }
}
