package Fachada;

import Dominio.EntidadeDominio;
import Dominio.Resultado;

public interface IFachada {
	public Resultado Inserir(EntidadeDominio entidade);
	public Resultado Alterar(EntidadeDominio entidade);
	public Resultado Excluir(EntidadeDominio entidade);
	public Resultado Consultar(EntidadeDominio entidade);

}
