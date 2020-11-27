package Command;

import Dominio.EntidadeDominio;
import Dominio.Resultado;

public class SalvarCommand extends AbstractCommand {

	@Override
	public Resultado executar(EntidadeDominio entidade) {
		return fachada.salvar(entidade);
	}
}
