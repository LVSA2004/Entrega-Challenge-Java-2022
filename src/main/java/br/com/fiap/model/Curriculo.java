package br.com.fiap.model;

public class Curriculo {
    private String descricao_curric;
    private String exp_profissional;
    private String caracteristica_curriculo;
    private String proeficiencias_curriculo;
    private String idiomas_curriculo;
    
    public Curriculo(String descricao_curric, String exp_profissional, String caracteristica_curriculo,
            String proeficiencias_curriculo, String idiomas_curriculo) {
        this.descricao_curric = descricao_curric;
        this.exp_profissional = exp_profissional;
        this.caracteristica_curriculo = caracteristica_curriculo;
        this.proeficiencias_curriculo = proeficiencias_curriculo;
        this.idiomas_curriculo = idiomas_curriculo;
    }

    public String getDescricao_curric() {
        return descricao_curric;
    }
    public void setDescricao_curric(String descricao_curric) {
        this.descricao_curric = descricao_curric;
    }
    public String getExp_profissional() {
        return exp_profissional;
    }
    public void setExp_profissional(String exp_profissional) {
        this.exp_profissional = exp_profissional;
    }
    public String getCaracteristica_curriculo() {
        return caracteristica_curriculo;
    }
    public void setCaracteristica_curriculo(String caracteristica_curriculo) {
        this.caracteristica_curriculo = caracteristica_curriculo;
    }
    public String getProeficiencias_curriculo() {
        return proeficiencias_curriculo;
    }
    public void setProeficiencias_curriculo(String proeficiencias_curriculo) {
        this.proeficiencias_curriculo = proeficiencias_curriculo;
    }
    public String getIdiomas_curriculo() {
        return idiomas_curriculo;
    }
    public void setIdiomas_curriculo(String idiomas_curriculo) {
        this.idiomas_curriculo = idiomas_curriculo;
    }

    @Override
    public String toString() {
        return "Curriculo [descricao_curric=" + descricao_curric + ", exp_profissional=" + exp_profissional
                + ", caracteristica_curriculo=" + caracteristica_curriculo + ", proeficiencias_curriculo="
                + proeficiencias_curriculo + ", idiomas_curriculo=" + idiomas_curriculo + "]";
    } 
}
