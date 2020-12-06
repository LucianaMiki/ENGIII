package br.com.fatec.dominio;

public class Tudo extends EntidadeDominio{
	protected Filme filme;
	protected Sala sala;
	protected Sessao sessao;
	
	public Tudo() {
		
	}
	
	public Tudo(Filme filme, Sala sala, Sessao sessao) {
		this.filme = filme;
		this.sala = sala;
		this.sessao = sessao;
	}
	
	public Filme getFilme() {
		return filme;
	}
	
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public Sessao getSessao() {
		return sessao;
	}
	
	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}
}