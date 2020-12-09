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

public class ResultadoControle extends Controle {
	private static final long serialVersionUID = 1L;
	
	public ResultadoControle() {}
	
	public static void Resultado(HttpServletRequest request) {
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
        
        request.setAttribute("Filme", listFilme);
        
	}
}