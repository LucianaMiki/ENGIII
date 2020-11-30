package ViewHelper;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dominio.EntidadeDominio;
import Dominio.Filme;
import Dominio.Func;
import Dominio.Resultado;


public class FilmeVH implements IViewHelper {

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {

		HttpSession session = null;
		Func func = null;
		String operacao = request.getParameter("operacao");

		if (operacao.equals("SALVAR")) {
			func = criarFunc(request);

		} else if (operacao.equals("ALTERAR")) {
			func = criarFunc(request);

		} else if (operacao.equals("EXCLUIR")) {
			func = criarFunc(request);

		} else if (operacao.equals("CONSULTAR")) {
			func = criarFunc(request);

		} else if (operacao.equals("PERFIL")) {
			int id_func = Integer.parseInt(request.getParameter("id"));
			func = new Func();
			func.setId(id_func);
		}

		return func;

	}

	private Filme criarFilme(HttpServletRequest request) {

		Filme filme = new Filme();

		Func func = new Func();
		func.setEmail(request.getParameter("txtEmail"));
		func.setSenha(request.getParameter("txtSenha"));
		String idFunc = request.getParameter("txtIdFuncionario");
		//func.setPerfilAtendimento(perfil);
		filme.setTitulo(request.getParameter("txtTitulo"));
                filme.setDuracao(request.getParameter("InstantDuracao"));
                
                filme.setElenco(request.getParameter("txtElenco"));
                filme.setEstreia(request.getParameter("CalendarEstreia"));
                               
		filme.setSinopse(request.getParameter("txtSinopse"));
                filme.setDiretor(request.getParameter("txtDiretor"));     
                
                return filme;
	}

	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		RequestDispatcher d = null;
		String operacao = request.getParameter("operacao");

		if (resultado.getMsg() != null && !resultado.getMsg().trim().equals("")) {
			request.getSession().setAttribute("resultado", resultado);
			d = request.getRequestDispatcher("formadd.jsp");

		} else if (operacao.equals("CADASTRAR")) {
			Func func = (Func) resultado.getEntidades().get(0);
			resultado.setMsg("Cadastro realizado com sucesso.");
			request.getSession().setAttribute("resultado", resultado);
			d = request.getRequestDispatcher("formadd.jsp");
        } 

		d.forward(request, response);

	}
}
