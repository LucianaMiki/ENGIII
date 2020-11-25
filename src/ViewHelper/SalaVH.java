/*package ViewHelper;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.Dominio.Sala;
import src.Dominio.EntidadeDominio;
import src.Dominio.Resultado;


public class SalaVH implements IViewHelper {

	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {

		HttpSession session = null;
		Sala sala = null;
		String operacao = request.getParameter("operacao");

		if (operacao.equals("SALVAR")) {
			funcionario = criarFuncionario(request);

		} else if (operacao.equals("ALTERAR")) {
			funcionario = criarFuncionario(request);

		} else if (operacao.equals("EXCLUIR")) {
			funcionario = criarFuncionario(request);

		} else if (operacao.equals("CONSULTAR")) {
			funcionario = criarFuncionario(request);

		} else if (operacao.equals("PERFIL")) {
			int id_funcionario = Integer.parseInt(request.getParameter("id"));
			funcionario = new Funcionario();
			funcionario.setId(id_funcionario);
		}

		return sala;

	}

	private Sala criarFuncionario(HttpServletRequest request) {

		Sala sala = new Sala();

		/*Usuario usuario = new Usuario();
		usuario.setLogin(request.getParameter("txtEmail"));
		usuario.setSenha(request.getParameter("txtSenha"));

		String idFuncionario = request.getParameter("txtIdFuncionario");
		String idPerfil = request.getParameter("txtPerfil");
		String idCargo = request.getParameter("txtCargo");
		String idSetor = request.getParameter("txtSetor");
		String idRegional = request.getParameter("txtRegional");
		String idCadastradoPor = request.getParameter("txtCadastradoPor");

		if (idPerfil != null && !idPerfil.trim().equals("")) {
			perfil.setId(Integer.parseInt(idPerfil));
		}

		usuario.setPerfilAtendimento(perfil);
		Sala.setCodigo(request.getParameter("txtCodigo"));
		Sala.setTipo(request.getParameter("txtTipo"));
		Sala.setTipo(request.getParameter("txtCapacidade"));

		return Sala;
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
			// Funcionario funcionario = (Funcionario) resultado.getEntidades().get(0);
			resultado.setMsg("Cadastro realizado com sucesso.");
			request.getSession().setAttribute("resultado", resultado);
			d = request.getRequestDispatcher("formadd.jsp");
        } 

		d.forward(request, response);

	}
}*/
