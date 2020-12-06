package Strategy;

import Dominio.EntidadeDominio;
import Dominio.Sala;
import dao.IDAO;
import dao.SalaDAO;

public class ValidarLimiteSala {
    public String processar(EntidadeDominio entidade) {

        Sala sala = (Sala) entidade;
	IDAO dao = new SalaDAO();
	if(dao.Consultar(sala).size() >= 6) {
	return "Limite de Sala ja atingido!";
	}
	return null;
    }
}
