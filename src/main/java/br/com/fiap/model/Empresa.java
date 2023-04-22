package br.com.fiap.model;

public class Empresa {
    private String nome_emp;
    private String telefone_emp;
    private String email_emp;
    private String cnpj;
    private String seguimento_empresarial;
    private String descricao_emp;
    
    public Empresa(String nome_emp, String telefone_emp, String email_emp, String cnpj, String seguimento_empresarial,
            String descricao_emp) {
        this.nome_emp = nome_emp;
        this.telefone_emp = telefone_emp;
        this.email_emp = email_emp;
        this.cnpj = cnpj;
        this.seguimento_empresarial = seguimento_empresarial;
        this.descricao_emp = descricao_emp;
    }

    public String getNome_emp() {
        return nome_emp;
    }
    public void setNome_emp(String nome_emp) {
        this.nome_emp = nome_emp;
    }
    public String getTelefone_emp() {
        return telefone_emp;
    }
    public void setTelefone_emp(String telefone_emp) {
        this.telefone_emp = telefone_emp;
    }
    public String getEmail_emp() {
        return email_emp;
    }
    public void setEmail_emp(String email_emp) {
        this.email_emp = email_emp;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getSeguimento_empresarial() {
        return seguimento_empresarial;
    }
    public void setSeguimento_empresarial(String seguimento_empresarial) {
        this.seguimento_empresarial = seguimento_empresarial;
    }
    public String getDescricao_emp() {
        return descricao_emp;
    }
    public void setDescricao_emp(String descricao_emp) {
        this.descricao_emp = descricao_emp;
    }

    @Override
    public String toString() {
        return "Empresa [nome_emp=" + nome_emp + ", telefone_emp=" + telefone_emp + ", email_emp=" + email_emp
                + ", cnpj=" + cnpj + ", seguimento_empresarial=" + seguimento_empresarial + ", descricao_emp="
                + descricao_emp + "]";
    }
}
