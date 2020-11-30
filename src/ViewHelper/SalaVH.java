package ViewHelper;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dominio.Sala;
import Dominio.EntidadeDominio;
import Dominio.Func;
import Dominio.Resultado;


public class SalaVH implements IViewHelper {

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {

		HttpSession session = null;
		Sala func = null;
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
			func = new Sala();
			func.setId(id_func);
		}

		return func;

	}

	private Sala criarFunc(HttpServletRequest request) {

		Sala sala = new Sala();

		Func func = new Func();
		func.setEmail(request.getParameter("txtEmail"));
		func.setSenha(request.getParameter("txtSenha"));
		String idFunc = request.getParameter("txtIdFuncionario");
		//func.setPerfilAtendimento(perfil);
		sala.setCodigo(request.getParameter("intCodigo"));
		sala.setTipo(request.getParameter("intTipo"));
		sala.setTipo(request.getParameter("intCapacidade"));
		return sala;
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
