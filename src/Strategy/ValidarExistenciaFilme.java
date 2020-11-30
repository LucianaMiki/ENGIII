package Strategy;

import dao.FilmeDAO;
import dao.IDAO;
import Dominio.EntidadeDominio;
import Dominio.Filme;

public class ValidarExistenciaFilme implements IStrategy {

	public String processar(EntidadeDominio entidade) {

		Filme filme = (Filme) entidade;
		IDAO dao = new FilmeDAO();
		
		if(dao.Consultar(filme).size() != 0) {
			return "Filme ja cadastrado!";
		}
		
		return null;
	}

}
