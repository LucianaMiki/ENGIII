package br.com.fatec.dao;

import java.util.List;

import br.com.fatec.dominio.EntidadeDominio;

public interface IDAO {
	public void salvar(EntidadeDominio entidade);
	public void alterar(EntidadeDominio entidade);
	public void excluir(EntidadeDominio entidade);
	public List<EntidadeDominio> Consultar(EntidadeDominio entidade);
}