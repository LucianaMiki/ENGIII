package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Command.ICommand;
import Dominio.EntidadeDominio;
import Dominio.Resultado;
import ViewHelper.SessaoVH;
import ViewHelper.IViewHelper;

@WebServlet(urlPatterns = {"/SessaoController"})
public class SessaoController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private Map<String, ICommand> commands;
    private Map<String, IViewHelper> vhs;
    
    public SessaoController() {
		commands = new HashMap<String, ICommand>();
	
		vhs = new HashMap<String, IViewHelper>();
		vhs.put("/ESIII/SessaoController", new SessaoVH());
    }
    
    protected void doProcessServlet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();		
		String operacao = request.getParameter("operacao");
		
		IViewHelper vh = vhs.get(uri);
		EntidadeDominio entidade = vh.getEntidade(request);

		ICommand command = null;
		Resultado resultado = null;

		command = commands.get(operacao);
		resultado = command.executar(entidade);
		
		vh.setView(resultado, request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcessServlet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcessServlet(request, response);

	}
}