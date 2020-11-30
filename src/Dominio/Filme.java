package Dominio;

import java.sql.Time;

public class Filme extends EntidadeDominio {

    private String Titulo;
    private String Estreia;
    private Time Duracao;
    private String Diretor;
    private String Elenco;
    private String Sinopse;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEstreia() {
        return Estreia;
    }

    public void setEstreia(String Estreia) {
        this.Estreia = Estreia;
    }

    

    public Time getDuracao() {
        return Duracao;
    }

    public void setDuracao(Time Duracao) {
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
