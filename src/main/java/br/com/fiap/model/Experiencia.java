package br.com.fiap.model;

public class Experiencia {
    private String data_inicio;
    private String data_fim;
    private String cargo;
    private String descricao_exp;
    

    public Experiencia(String data_inicio, String data_fim, String cargo, String descricao_exp) {
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.cargo = cargo;
        this.descricao_exp = descricao_exp;
    }
    
    public String getData_inicio() {
        return data_inicio;
    }
    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }
    public String getData_fim() {
        return data_fim;
    }
    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDescricao_exp() {
        return descricao_exp;
    }
    public void setDescricao_exp(String descricao_exp) {
        this.descricao_exp = descricao_exp;
    }

    @Override
    public String toString() {
        return "Experiencia [data_inicio=" + data_inicio + ", data_fim=" + data_fim + 
        ",cargo=" + cargo + ", descricao_exp=" + descricao_exp + "]";
    }
}
