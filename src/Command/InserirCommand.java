package Command;

import Dominio.EntidadeDominio;
import Dominio.Resultado;

public class InserirCommand extends AbstractCommand {

	@Override
	public Resultado executar(EntidadeDominio entidade) {
		return fachada.Inserir(entidade);
	}
}
