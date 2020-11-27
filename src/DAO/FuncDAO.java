package DAO;

import Dominio.EntidadeDominio;
import Dominio.Func;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import util.Conexao;

public class FuncDAO extends AbstractJdbcDAO {

    public FuncDAO() {
        super("funcionario", "id_func");
    }

    private Connection conexao = null;

     public void Inserir(EntidadeDominio entidade) {
       openConnection();
        PreparedStatement pst = null;
        Func func = (Func) entidade;

        try {
            connection = Conexao.getConnectionPostgres();
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO funcionario(id_func, email, senha, permss) VALUES (?,?,?,?)");

            pst = connection.prepareStatement(sql.toString());

            pst.setInt(1, func.getId());
            pst.setString(2, func.getEmail());
            pst.setString(3, func.getSenha());
            pst.setString(4, func.getPermss());
            pst.executeUpdate();

            connection.commit();
        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
            }

        } finally {
            try {
                pst.close();
                connection.close();
            } catch (SQLException e) {
            }
        }
    }

    @Override
    public void alterar(EntidadeDominio entidade) {

        PreparedStatement pst = null;
        Func func = (Func) entidade;

        try {
            connection = Conexao.getConnectionPostgres();

            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE sala SET email=?, senha=?, permss=?");
            sql.append("WHERE id_func=?");

            pst = connection.prepareStatement(sql.toString());

            pst.setString(1, func.getEmail());
            pst.setString(2, func.getSenha());
            pst.setString(3, func.getPermss());
            pst.setInt(4, func.getId());
            pst.executeUpdate();

        } catch (Exception e) {
        }

    }

    @Override
    public void excluir(EntidadeDominio entidade) {
    }

    @Override
    public List<EntidadeDominio> Consultar(EntidadeDominio entidade) {
        openConnection();
        PreparedStatement pst = null;
        Func func = (Func) entidade;

        try {
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("SELECT FROM funcionario (id_func, email, senha, permss) WHERE ?");

            pst = connection.prepareStatement(sql.toString());
            pst.setInt(1, func.getId());
            pst.setString(2, func.getEmail());
            pst.setString(3, func.getSenha());
            pst.setString(4, func.getPermss());
            pst.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
            }
        } finally {
            try {
                pst.close();
                connection.close();
            } catch (SQLException e) {
            }
        }
        return null;
    }

	@Override
	public void salvar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		
	}
}
