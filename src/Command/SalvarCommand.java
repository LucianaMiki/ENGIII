package Command;

import src.Dominio.EntidadeDominio;
import src.Dominio.Resultado;

public class SalvarCommand extends AbstractCommand {

	@Override
	public Resultado executar(EntidadeDominio entidade) {
		return fachada.salvar(entidade);
	}
}
