package br.com.fatec.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fatec.command.AlterarCommand;
import br.com.fatec.command.ExcluirCommand;
import br.com.fatec.command.Fachada;
import br.com.fatec.command.ICommand;
import br.com.fatec.command.InserirCommand;
import br.com.fatec.dao.FilmeDAO;
import br.com.fatec.dao.IDAO;
import br.com.fatec.dao.SalaDAO;
import br.com.fatec.dao.SessaoDAO;
import br.com.fatec.dominio.EntidadeDominio;
import br.com.fatec.dominio.Filme;
import br.com.fatec.dominio.Resultado;
import br.com.fatec.dominio.Sala;
import br.com.fatec.dominio.Sessao;
import br.com.fatec.viewhelper.IViewHelper;
import br.com.fatec.viewhelper.FilmeVH;
import br.com.fatec.viewhelper.SalaVH;
import br.com.fatec.viewhelper.SessaoVH;

public class EditarControle extends Controle {
	private static final long serialVersionUID = 1L;
	
	public EditarControle() {}
	
	public static String Editar(HttpServletRequest request, String operacao) {
		// mano essa classe vai ter role pra caraio heim pqpppppppppppp
		//vamo por partes
		
		Fachada fachada = new Fachada();
		StringBuilder msg = new StringBuilder();
		
		//aqui vai pegar o numero da sala escolhida pra alterar
		Integer numSalaCerta = Integer.parseInt(operacao.substring(13));
		
		//aqui vai pegar tudinho oq tem no bd, separado por dominios
		Filme filme = new Filme();
		Sala sala = new Sala();
		Sessao sessao = new Sessao();
		
		EntidadeDominio entidadeFilme = (EntidadeDominio) filme;
		EntidadeDominio entidadeSala = (EntidadeDominio) sala;
		EntidadeDominio entidadeSessao = (EntidadeDominio) sessao;
		
		IDAO daoF = new FilmeDAO();
		IDAO daoSa = new SalaDAO();
		IDAO daoSe = new SessaoDAO();
		
		List<EntidadeDominio> listFilme = new ArrayList<EntidadeDominio>();
		List<EntidadeDominio> listSala = new ArrayList<EntidadeDominio>();
		List<EntidadeDominio> listSessao = new ArrayList<EntidadeDominio>();
		
        listFilme = daoF.Consultar(entidadeFilme);
        listSala = daoSa.Consultar(entidadeSala);
        listSessao = daoSe.Consultar(entidadeSessao);
        
        Integer IdSala = null;
        Integer CodigoJSP = null;
        String TipoJSP = null;
        Integer CapacidadeJSP = null;
        
        Integer IdSessao = null;
        Float valor_meiaJSP = null;
        Float valor_inteiraJSP = null;
        String dt_inicioJSP = null;
        String dt_fimJSP = null;
        Integer fxeJSP = null;
        
        Integer IdFilme = null;
        String TituloJSP = null;
        String EstreiaJSP = null;
        String DuracaoJSP = null;
        String DiretorJSP = null;
        String ElencoJSP = null;
        String SinopseJSP = null;
        
	    for(int i=0;i<listSala.size();i++) {
	        sala = (Sala) listSala.get(i);
	        	
	        Integer numSala = Integer.parseInt(sala.getCodigo());
	        	
	        if(numSala == numSalaCerta) {
	        	IdSala = sala.getId();
	        	CodigoJSP = numSala;
	        	TipoJSP = sala.getTipo();
	        	CapacidadeJSP = sala.getCapacidade();	
	        }	
	     }
	    
	    if(CodigoJSP != null) {
	    	for(int i=0;i<listSessao.size();i++) {
	    		sessao = (Sessao) listSessao.get(i);
	    		Integer IdSessaoIf = sessao.getSalaId();
	    		if(IdSala == IdSessaoIf) {
	    			System.out.println("entrou");
	    			IdSessao = sessao.getId();
	    			valor_meiaJSP = sessao.getValor_meia();
	    			valor_inteiraJSP = sessao.getValor_inteira();
	    			dt_inicioJSP = sessao.getDt_incio();
	    			dt_fimJSP = sessao.getDt_fim();
	    			fxeJSP = sessao.getFxe();
	    			IdFilme = sessao.getFilmeId();
	    		}  		
	    	}
	    }
	    
	    if(IdSessao != null) {
	    	for(int i=0;i<listFilme.size();i++) {
	    		filme = (Filme) listFilme.get(i);
	    		Integer IdFilmeIf;
	    	}
	    }
        		
        //filme = (Filme) listFilme.get(i);
        //sessao = (Sessao) listSessao.get(i);
		
		return null;
	}
}