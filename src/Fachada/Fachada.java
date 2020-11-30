package Fachada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.SalaDAO;
import dao.IDAO;
import Dominio.Func;
import Dominio.EntidadeDominio;
import Dominio.Filme;
import Dominio.Sala;
import Dominio.Resultado;
import Dominio.Sessao;
import Strategy.IStrategy;
import Strategy.ValidarExistenciaFilme;
import Strategy.ValidarExistenciaSala;
import Strategy.ValidarExistenciaSessao;
import dao.FilmeDAO;
import dao.SessaoDAO;

public class Fachada implements IFachada {

    private Map<String, IDAO> daos;
    private Map<String, List<IStrategy>> rns;
    private StringBuilder sb = new StringBuilder();
    Resultado resultado;

    IDAO dao = null;
    String nmClasse = null;
    List<IStrategy> rng = null;

    public Fachada() {
        daos = new HashMap<String, IDAO>();
        rns = new HashMap<String, List<IStrategy>>();

     
        daos.put(Sala.class.getName(), new SalaDAO());

		List<IStrategy> rnsSala = new ArrayList<IStrategy>();
		rnsSala.add(new ValidarExistenciaSala());
		rns.put(Sala.class.getName(), rnsSala);
         
        daos.put(Filme.class.getName(), new FilmeDAO());

		List<IStrategy> rnsFilme = new ArrayList<IStrategy>();
		rnsFilme.add(new ValidarExistenciaFilme());
		rns.put(Filme.class.getName(), rnsFilme);
                
         daos.put(Sessao.class.getName(), new SessaoDAO());

		List<IStrategy> rnsSessao = new ArrayList<IStrategy>();
		rnsSessao.add(new ValidarExistenciaSessao());
		rns.put(Sessao.class.getName(), rnsSessao);
       

    }

    @Override
    public Resultado Inserir(EntidadeDominio entidade) {
        resultado = new Resultado();
        nmClasse = entidade.getClass().getName();
        rng = rns.get(nmClasse);
        sb.setLength(0);

        if (sb.length() == 0 || sb.toString().trim().equals("")) {
            try {
                dao = daos.get(nmClasse);
                dao.Inserir(entidade);
                resultado.addEntidades(entidade);
            } catch (Exception e) {
                e.printStackTrace();
                resultado.setMsg("N�o foi poss�vel Salvar...");
            }
        } else {

            resultado.addEntidades(entidade);
            resultado.setMsg(sb.toString());
        }

        return resultado;

    }

    @Override
    public Resultado Alterar(EntidadeDominio entidade) {
        resultado = new Resultado();
        sb.setLength(0);

        nmClasse = entidade.getClass().getName();

        executarRegras(rns.get(nmClasse), entidade);

        if (sb.toString().trim().equals("")) {
            try {
                dao = daos.get(nmClasse);
                dao.Alterar(entidade);
                resultado.addEntidades(entidade);

            } catch (Exception e) {
                e.printStackTrace();
                resultado.setMsg(sb + "\nN�o foi poss�vel alterar...");
            }
        } else {
            resultado.setMsg(sb.toString());
            resultado.addEntidades(entidade);
        }

        return resultado;

    }

    @Override
    public Resultado Excluir(EntidadeDominio entidade) {
        resultado = new Resultado();

        String nmClasse = entidade.getClass().getName();

        dao = daos.get(nmClasse);
        executarRegras(rns.get(nmClasse), entidade);

        try {
            dao.Excluir(entidade);
            resultado.addEntidades(entidade);

        } catch (Exception e) {
            e.printStackTrace();
            resultado.setMsg("N�o foi poss�vel Excluir...");
        }

        return resultado;

    }

    @Override
    public Resultado Consultar(EntidadeDominio entidade) {
        resultado = new Resultado();
        nmClasse = entidade.getClass().getName();
        rng = rns.get(nmClasse);
        sb.setLength(0);

        if (sb.length() == 0 || sb.toString().trim().equals("")) {
            try {
                dao = daos.get(nmClasse);
                dao.Inserir(entidade);
                resultado.addEntidades(entidade);
            } catch (Exception e) {
                e.printStackTrace();
                resultado.setMsg("N�o foi poss�vel Consultar...");
            }
        } else {

            resultado.addEntidades(entidade);
            resultado.setMsg(sb.toString());
        }

        return resultado;
    }

    private String executarRegras(List<IStrategy> get, EntidadeDominio entidade) {
        String nmClass = entidade.getClass().getName();
        StringBuilder msg = new StringBuilder();
        List<IStrategy> regrasOperacao = rns.get(nmClass);

        if (regrasOperacao != null) {
            List<IStrategy> regras = regrasOperacao;
            if (regras != null) {
                for (IStrategy s : regras) {
                    String m = s.processar(entidade);
                    if (m != null) {
                        msg.append(m);
                        msg.append("\n");
                    }
                }
            }
        }

        if (msg.length() > 0) {
            return msg.toString();
        } else {
            return null;
        }
    }
//
    
    
}
