package br.com.fatec.controller;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fatec.command.AlterarCommand;
import br.com.fatec.command.ExcluirCommand;
import br.com.fatec.command.ICommand;
import br.com.fatec.command.InserirCommand;
import br.com.fatec.dominio.EntidadeDominio;
import br.com.fatec.dominio.Resultado;
import br.com.fatec.viewhelper.IViewHelper;
import br.com.fatec.viewhelper.TudoVH;
import br.com.fatec.viewhelper.FilmeVH;

public class SalaController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String operacao = null;
    private static Map<String, ICommand> commands;
    private static Map<String, IViewHelper> vhs;
    
    public SalaController() {
    	super();
		commands = new HashMap<String, ICommand>();
		commands.put("CADASTRAR", new InserirCommand());
		commands.put("EXCLUIR", new ExcluirCommand());	
		//commands.put("CONSULTAR", new ConsultarCommand());
		commands.put("ALTERAR", new AlterarCommand());
		
		vhs = new HashMap<String, IViewHelper>();
		vhs.put("/ESIIItest/SalvarTudo", new TudoVH());
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
    	operacao = request.getParameter("operacao");
		
		String uri = request.getRequestURI();		
		
		IViewHelper vh = vhs.get(uri);
		
		EntidadeDominio entidade = vh.getEntidade(request);
		
		ICommand cmd = commands.get(operacao);		
		
		Object msg = cmd.executar(entidade);
		
		vh.setView(msg, request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		operacao = request.getParameter("operacao");
		
		String uri = request.getRequestURI();		
		
		IViewHelper vh = vhs.get(uri);
		
		EntidadeDominio entidade = vh.getEntidade(request);
		
		ICommand cmd = commands.get(operacao);		
		
		Object msg = cmd.executar(entidade);
		System.out.println(msg);
		System.out.println(cmd);
		System.out.println(entidade);
		
		vh.setView(msg, request, response);

	}
}

