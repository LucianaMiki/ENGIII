package br.com.fatec.viewhelper;
/*package ViewHelper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dominio.EntidadeDominio;
import Dominio.Filme;
import Dominio.Func;
import Dominio.Resultado;
import Dominio.Sala;
import Dominio.Sessao;


public class SessaoVH implements IViewHelper {

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		float txtValorM = Float.parseFloat(request.getParameter("valorM"));
		float txtValorI = Float.parseFloat(request.getParameter("valorI"));
		String txtDtI = request.getParameter("dtI");
		String txtDtS = request.getParameter("DtS");
		Integer txtHorarios = Integer.parseInt(request.getParameter("horarios"));
		
		Sessao sessao = new Sessao(txtValorM, txtValorI, txtDtI, txtDtS, txtHorarios);
		return sessao;
	}

	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		PrintWriter out;
		try {
			out = response.getWriter();
			if (resultado != null) {
				out.println(resultado);
			} else {
				out.println("<h1>Sessao cadastrada!</h1>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}
}*/
