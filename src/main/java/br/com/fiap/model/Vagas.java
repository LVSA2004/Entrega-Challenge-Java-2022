package br.com.fiap.model;

public class Vagas {
    private String titulo_vaga;
    private String descricao_vaga;
    private String salario_vaga;
    private String quantidade_vagas;
    
    public Vagas(String titulo_vaga, String descricao_vaga, String salario_vaga, String quantidade_vagas) {
        this.titulo_vaga = titulo_vaga;
        this.descricao_vaga = descricao_vaga;
        this.salario_vaga = salario_vaga;
        this.quantidade_vagas = quantidade_vagas;
    }
    
    public String getTitulo_vaga() {
        return titulo_vaga;
    }
    public void setTitulo_vaga(String titulo_vaga) {
        this.titulo_vaga = titulo_vaga;
    }
    public String getDescricao_vaga() {
        return descricao_vaga;
    }
    public void setDescricao_vaga(String descricao_vaga) {
        this.descricao_vaga = descricao_vaga;
    }
    public String getSalario_vaga() {
        return salario_vaga;
    }
    public void setSalario_vaga(String salario_vaga) {
        this.salario_vaga = salario_vaga;
    }
    public String getQuantidade_vagas() {
        return quantidade_vagas;
    }
    public void setQuantidade_vagas(String quantidade_vagas) {
        this.quantidade_vagas = quantidade_vagas;
    }

    @Override
    public String toString() {
        return "Vagas [titulo_vaga=" + titulo_vaga + ", descricao_vaga=" + descricao_vaga + ", salario_vaga="
                + salario_vaga + ", quantidade_vagas=" + quantidade_vagas + "]";
    }
}
