package Strategy;

import Dominio.EntidadeDominio;
import Dominio.Sessao;
import dao.SessaoDAO;
import dao.IDAO;

public class ValidarCalculoIngresso implements IStrategy {

    public String processar(EntidadeDominio entidade) {
        Sessao sessao = (Sessao) entidade;
        IDAO dao = new SessaoDAO();

        if ((sessao.getValor_inteira() / 2 != sessao.getValor_meia()) || sessao.getValor_meia() == sessao.getValor_inteira()) {
            return "Valor da meia entrada deve ser metade da inteira!";

        }
        return null;
    }

}
