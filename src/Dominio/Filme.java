package Dominio;

import java.util.Date;

public class Filme extends EntidadeDominio {
 	
    private String Titulo;
    private Date Estreia;
    private Date Duracao;
    private String Diretor;
    private String Elenco;
    private String Sinopse;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Date getEstreia() {
        return Estreia;
    }

    public void setEstreia(Date Estreia) {
        this.Estreia = Estreia;
    }

    public Date getDuracao() {
        return Duracao;
    }

    public void setDuracao(Date Duracao) {
        this.Duracao = Duracao;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String Diretor) {
        this.Diretor = Diretor;
    }

    public String getElenco() {
        return Elenco;
    }

    public void setElenco(String Elenco) {
        this.Elenco = Elenco;
    }

    public String getSinopse() {
        return Sinopse;
    }

    public void setSinopse(String Sinopse) {
        this.Sinopse = Sinopse;
    }
    
    
    
}
