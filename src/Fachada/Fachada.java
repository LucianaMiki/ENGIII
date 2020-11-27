package Fachada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import DAO.SalaDAO;
import DAO.IDAO;
import Dominio.EntidadeDominio;
import Dominio.Sala;
import Dominio.Resultado;
//import Strategy.IStrategy;

public class Fachada implements IFachada {

    private Map<String, IDAO> daos;
    //private Map<String, List<IStrategy>> rns;
	private StringBuilder sb = new StringBuilder();
    Resultado resultado;
    
    IDAO dao = null;
    String nmClasse = null;
    //List<IStrategy> rng = null;

    public Fachada() {
		daos = new HashMap<String, IDAO>();
		//rns = new HashMap<String, List<IStrategy>>();

		// definindo dao para sala
        //daos.put(Sala.class.getCodigo(), new SalaDAO());

        //rns.put(Funcionario.class.getName(), rnsFuncionario);

    }

    public Resultado salvar(EntidadeDominio entidade) {
        resultado = new Resultado();
		nmClasse = entidade.getClass().getName();
		//rng = rns.get(nmClasse);
        sb.setLength(0);
        
        if (sb.length() == 0 || sb.toString().trim().equals("")) {
			try {
				dao = daos.get(nmClasse);
				dao.salvar(entidade);
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
        
      public Resultado excluir(EntidadeDominio entidade) {
            resultado = new Resultado();
    
            String nmClasse = entidade.getClass().getName();
    
            dao = daos.get(nmClasse);
    
            try {
                dao.excluir(entidade);
                resultado.addEntidades(entidade);
    
            } catch (Exception e) {
                e.printStackTrace();
                resultado.setMsg("N�o foi poss�vel Excluir...");
            }
    
            return resultado;
        }

        public Resultado alterar(EntidadeDominio entidade) {
            resultado = new Resultado();
            sb.setLength(0);
    
            nmClasse = entidade.getClass().getName();
    
            //executarRegras(rns.get(nmClasse), entidade);
    
            if (sb.toString().trim().equals("")) {
                try {
                    dao = daos.get(nmClasse);
                    dao.alterar(entidade);
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
		public Resultado consultar(EntidadeDominio entidade) {
			// TODO Auto-generated method stub
			return null;
		}


    }

