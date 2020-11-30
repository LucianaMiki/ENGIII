package Strategy;

import DAO.SalaDAO;
import DAO.IDAO;
import Dominio.EntidadeDominio;
import Dominio.Sala;

public class ValidarExistenciaSala implements IStrategy {

	public String processar(EntidadeDominio entidade) {

		Sala sala = (Sala) entidade;
		IDAO dao = new SalaDAO();
		
		if(dao.Consultar(sala).size() != 0) {
			return "Sala ja cadastrada!";
		}
		
		return null;
	}

}
