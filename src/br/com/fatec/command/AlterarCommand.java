package br.com.fatec.command;

import br.com.fatec.dominio.EntidadeDominio;
import br.com.fatec.dominio.Resultado;

public class AlterarCommand extends AbstractCommand {

	@Override
	public Object executar(EntidadeDominio entidade) {
		return fachada.Alterar(entidade);
	}

}
