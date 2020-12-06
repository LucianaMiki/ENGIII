package br.com.fatec.viewhelper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fatec.dominio.EntidadeDominio;
import br.com.fatec.dominio.Filme;
import br.com.fatec.dominio.Func;
import br.com.fatec.dominio.Sala;
import br.com.fatec.dominio.Sessao;
import br.com.fatec.dominio.Tudo;

public class TudoVH implements IViewHelper {

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String txtTitulo = request.getParameter("titulo");
		String txtEstreia = request.getParameter("estreia");
		String txtAno = request.getParameter("ano");
		String txtDuracao = request.getParameter("duracao");
		String txtElenco = request.getParameter("elenco");
		String txtSinopse = request.getParameter("sinopse");
		
		String txtCodigo = request.getParameter("txtCodigo");
		String txtTipo = request.getParameter("tipo");
		Integer txtCapacidade = Integer.parseInt(request.getParameter("capacidade"));
		
		float txtValorM = Float.parseFloat(request.getParameter("valorM"));
		float txtValorI = Float.parseFloat(request.getParameter("valorI"));
		String txtDtI = request.getParameter("dtI");
		String txtDtS = request.getParameter("DtS");
		Integer txtHorarios = Integer.parseInt(request.getParameter("horarios"));
		
		Filme filme = new Filme(txtTitulo, txtEstreia, txtAno, txtDuracao, txtElenco, txtSinopse);
		Sala sala = new Sala(txtCodigo, txtTipo, txtCapacidade);
		Sessao sessao = new Sessao(txtValorM, txtValorI, txtDtI, txtDtS, txtHorarios, sala, filme);
		
		return sessao;
	}
	
	@Override
	public void setView(Object resultado, HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		PrintWriter out;
		try {
			out = response.getWriter();
			if (resultado != null) {
				out.println(resultado);
			} else {
				out.println("<h1>Sala cadastrada!</h1>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}