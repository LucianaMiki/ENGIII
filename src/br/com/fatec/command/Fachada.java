package br.com.fatec.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fatec.dao.FilmeDAO;
import br.com.fatec.dao.IDAO;
import br.com.fatec.dao.SalaDAO;
import br.com.fatec.dao.SessaoDAO;
import br.com.fatec.dominio.EntidadeDominio;
import br.com.fatec.dominio.Filme;
import br.com.fatec.dominio.Func;
import br.com.fatec.dominio.Resultado;
import br.com.fatec.dominio.Sala;
import br.com.fatec.dominio.Sessao;
import br.com.fatec.dominio.Tudo;
import br.com.fatec.strategy.IStrategy;
import br.com.fatec.strategy.ValidaEmail;
import br.com.fatec.strategy.ValidarExistencia;
import br.com.fatec.strategy.ValidarExistenciaFilme;
import br.com.fatec.strategy.ValidarExistenciaSala;
import br.com.fatec.strategy.ValidarExistenciaSessao;

public class Fachada implements IFachada {
    private Map<String, IDAO> daos;
    
    private Map<String, List<IStrategy>> rns;
    
    private StringBuilder sb = new StringBuilder();

    IDAO dao = null;
    String nmClasse = null;
    List<IStrategy> rng = null;

    public Fachada() {
        daos = new HashMap<String, IDAO>();
        rns = new HashMap<String, List<IStrategy>>();
        
        ValidaEmail vEmail = new ValidaEmail();
        ValidarExistencia vExistencia = new ValidarExistencia();
        ValidarExistenciaFilme vExiFilme = new ValidarExistenciaFilme();
        ValidarExistenciaSala vExiSala = new ValidarExistenciaSala();
        ValidarExistenciaSessao vExiSessao = new ValidarExistenciaSessao();
     
        daos.put(Sala.class.getName(), new SalaDAO());

		List<IStrategy> rnsSala = new ArrayList<IStrategy>();
		rnsSala.add(vExiSala);
		rns.put(Sala.class.getName(), rnsSala);
         
        daos.put(Filme.class.getName(), new FilmeDAO());

		List<IStrategy> rnsFilme = new ArrayList<IStrategy>();
		rnsFilme.add(vExiFilme);
		rns.put(Filme.class.getName(), rnsFilme);
                
        daos.put(Sessao.class.getName(), new SessaoDAO());

		List<IStrategy> rnsSessao = new ArrayList<IStrategy>();
		rnsSessao.add(vExiSessao);
		rns.put(Sessao.class.getName(), rnsSessao);
		
		//daos.put(Tudo.class.getName(), new SessaoDAO());
       
    }

    @Override
    public String Inserir(EntidadeDominio entidade) {
        String nmClasse = entidade.getClass().getName();
        String msg = executarRegras(entidade);
        if (msg == null) {
			IDAO dao = daos.get(nmClasse);
			dao.salvar(entidade);
		} else {
			return msg;
		}
		return null;
    }
        
    public String executarRegras(EntidadeDominio entidade) {
    	String nmClasse = entidade.getClass().getName();
		StringBuilder msg = new StringBuilder();
		
		List<IStrategy> regras = rns.get(nmClasse);
		
		if (regras != null) {
			for (IStrategy s : regras) {
				String m = s.processar(entidade);

				if (m != null) {
					msg.append(m);
					msg.append("\n");
				}
			}
		}

		if (msg.length() > 0)
			return msg.toString();
		else
			return null;
    }

    @Override
    public String Alterar(EntidadeDominio entidade) {
    	String nmClasse = entidade.getClass().getName();
        String msg = executarRegras(entidade);
        if (msg == null) {
			IDAO dao = daos.get(nmClasse);
			dao.alterar(entidade);
		} else {
			return msg;
		}
		return null;
    }

    @Override
    public String Excluir(EntidadeDominio entidade) {
    	String nmClasse = entidade.getClass().getName();
        String msg = executarRegras(entidade);
        if (msg == null) {
			IDAO dao = daos.get(nmClasse);
			dao.excluir(entidade);
		} else {
			return msg;
		}
		return null;

    }

    @Override
    public String Consultar(EntidadeDominio entidade) {
    	String nmClasse = entidade.getClass().getName();
        String msg = executarRegras(entidade);
        if (msg == null) {
			IDAO dao = daos.get(nmClasse);
			dao.Consultar(entidade);
		} else {
			return msg;
		}
		return null;
    }
    
}
