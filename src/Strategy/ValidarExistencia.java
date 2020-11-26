package Strategy;

import dao.FuncDAO;
import dao.IDAO;
import Dominio.EntidadeDominio;
import Dominio.Func;

public class ValidarExistencia implements IStrategy {

	public String processar(EntidadeDominio entidade) {

		Func func = (Func) entidade;
		IDAO dao = new FuncDAO();
		
		if(dao.Consultar(func).size() != 0) {
			return "Funcionario ja cadastrado!";
		}
		
		return null;
	}

}
