package Command;

import Dominio.EntidadeDominio;
import Dominio.Resultado;

public interface ICommand {

	public Resultado executar(EntidadeDominio entidade);
	
}
