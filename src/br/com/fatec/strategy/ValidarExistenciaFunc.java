package br.com.fatec.strategy;

import br.com.fatec.dao.FuncDAO;
import br.com.fatec.dao.IDAO;
import br.com.fatec.dominio.EntidadeDominio;
import br.com.fatec.dominio.Func;

public class ValidarExistenciaFunc implements IStrategy {

	public String processar(EntidadeDominio entidade) {

		Func func = (Func) entidade;
		IDAO dao = new FuncDAO();
		
		if(dao.Consultar(func).size() != 0) {
			return "Funcionario ja cadastrado!";
		}
		
		return null;
	}

}
