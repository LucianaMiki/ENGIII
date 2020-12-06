package br.com.fatec.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import br.com.fatec.dominio.EntidadeDominio;
import br.com.fatec.dominio.Sala;

import java.sql.ResultSet;

public class SalaDAO extends AbstractJdbcDAO {

    public SalaDAO() {
        super("sala", "id_sal");
    }

    public void Inserir(EntidadeDominio entidade) {
        openConnection();
        PreparedStatement pst = null;
        Sala sala = (Sala) entidade;

        try {
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO sala (id_sal, id_cd_sal, id_tp_sal,id_cap_sal) VALUES (?, ?, ?, ?)");

            pst = connection.prepareStatement(sql.toString());
            pst.setInt(1, sala.getId());
            pst.setString(2, sala.getCodigo());
            pst.setString(3, sala.getTipo());
            pst.setInt(4, sala.getCapacidade());

            Timestamp time = new Timestamp(sala.getDtCadastro().getTime());
            pst.setTimestamp(3, time);
            pst.executeUpdate();
            /*
            ResultSet rs = pst.getGeneratedKeys();
            if (rs.next()){
                int last_inserted_id = rs.getInt(1);
                sala.setId(last_inserted_id);
            }          
            */
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

    }

    public void Alterar(EntidadeDominio entidade) {
        openConnection();
        PreparedStatement pst = null;
        Sala sala = (Sala) entidade;

        try {
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE sala SET id_cd_sal=?, id_tp_sal=?, id_cap_sal=?");
            sql.append("WHERE id_sal=?");

            pst = connection.prepareStatement(sql.toString());
            pst.setString(1, sala.getCodigo());
            pst.setString(2, sala.getTipo());
            pst.setInt(3, sala.getCapacidade());
            pst.setInt(4, sala.getId());

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

    }

    @Override
    public void excluir(EntidadeDominio entidade) {
    }

    @Override
    public List<EntidadeDominio> Consultar(EntidadeDominio entidade) {
        openConnection();
        PreparedStatement pst = null;
        Sala sala = (Sala) entidade;

        try {
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("SELECT FROM sala (id_sal, id_cd_sal, id_tp_sal,id_cap_sal) WHERE ?");

            pst = connection.prepareStatement(sql.toString());
            pst.setInt(1, sala.getId());
            pst.setString(2, sala.getCodigo());
            pst.setString(3, sala.getTipo());
            pst.setInt(4, sala.getCapacidade());
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

	@Override
	public void alterar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		
	}
}
