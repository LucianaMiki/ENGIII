package br.com.fatec.command;

import br.com.fatec.dominio.EntidadeDominio;
import br.com.fatec.dominio.Resultado;

public interface IFachada {
	public String Inserir(EntidadeDominio entidade);
	public String Alterar(EntidadeDominio entidade);
	public String Excluir(EntidadeDominio entidade);
	public String Consultar(EntidadeDominio entidade);

}
