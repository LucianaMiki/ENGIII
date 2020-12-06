package br.com.fatec.viewhelper;
/*package ViewHelper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dominio.Sala;
import Dominio.EntidadeDominio;
import Dominio.Filme;
import Dominio.Func;
import Dominio.Resultado;


public class SalaVH implements IViewHelper {

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String txtCodigo = request.getParameter("txtCodigo");
		String txtTipo = request.getParameter("tipo");
		Integer txtCapacidade = Integer.parseInt(request.getParameter("capacidade"));
		
		Sala sala = new Sala(txtCodigo, txtTipo, txtCapacidade);
		return sala;
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
				out.println("<h1>Sala cadastrada!</h1>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}
}*/
