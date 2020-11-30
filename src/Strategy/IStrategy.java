package Strategy;

import Dominio.EntidadeDominio;

public interface IStrategy {
	public String processar(EntidadeDominio entidade);
}