package Dao;

import java.util.List;

import Dominio.EntidadeDominio;

public interface IDAO {
	public void salvar(EntidadeDominio entidade);
	public void alterar(EntidadeDominio entidade);
	public void excluir(EntidadeDominio entidade);
}