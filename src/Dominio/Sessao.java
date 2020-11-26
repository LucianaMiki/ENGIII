package Dominio;

import java.sql.Date;

public class Sessao extends EntidadeDominio{
    	private float valor_meia;
        private float valor_inteira;
        private Date dt_incio;
        private Date dt_fim;

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

    public Date getDt_incio() {
        return dt_incio;
    }

    public void setDt_incio(Date dt_incio) {
        this.dt_incio = dt_incio;
    }

    public Date getDt_fim() {
        return dt_fim;
    }

    public void setDt_fim(Date dt_fim) {
        this.dt_fim = dt_fim;
    }

        
}
