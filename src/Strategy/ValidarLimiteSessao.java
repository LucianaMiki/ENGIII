package Strategy;

import dao.SessaoDAO;
import dao.IDAO;
import Dominio.EntidadeDominio;
import Dominio.Sessao;

public class ValidarLimiteSessao implements IStrategy {

    public String processar(EntidadeDominio entidade) {

        Sessao sessao = (Sessao) entidade;
        IDAO dao = new SessaoDAO();

        if (dao.Consultar(sessao).size() >= 6) {
            return "Limite de Sessao ja atingido!";
        }
        return null;
    }

}