package br.com.fatec.dominio;

public class Sessao extends EntidadeDominio{
    	private float valor_meia;
        private float valor_inteira;
        private String dt_inicio;
        private String dt_fim;
        private Integer fxe;
        private Sala sala; 
        private Filme filme;

    public Sessao() {}
    
    public Sessao(float valor_meia, float valor_inteira, String dt_inicio, String dt_fim, Integer fxe, Sala sala, Filme filme) {
    	this.valor_meia = valor_meia;
    	this.valor_inteira = valor_inteira;
    	this.dt_inicio = dt_inicio;
    	this.dt_fim = dt_fim;
    	this.fxe = fxe;
    	this.sala = sala;
    	this.filme = filme;
    }
        
    public float getValor_meia() {
        return valor_meia;
    }

    public void setValor_meia(float valor_meia) {
        this.valor_meia = valor_meia;
    }

    public float getValor_inteira() {
        return valor_inteira;
    }

    public void setValor_inteira(float valor_inteira) {
        this.valor_inteira = valor_inteira;
    }

    public String getDt_incio() {
        return dt_inicio;
    }

    public void setDt_incio(String dt_incio) {
        this.dt_inicio = dt_incio;
    }

    public String getDt_fim() {
        return dt_fim;
    }

    public void setDt_fim(String dt_fim) {
        this.dt_fim = dt_fim;
    }

    public int getFxe() {
        return fxe;
    }

    public void setFxe(int fxe) {
        this.fxe = fxe;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }


    
}
