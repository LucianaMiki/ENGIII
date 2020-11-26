package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import Dominio.EntidadeDominio;
import Dominio.Sessao;

public class SessaoDAO extends AbstractJdbcDAO {

    public SessaoDAO() {
        super("sessao", "id_ses");
    }

    public void Inserir(EntidadeDominio entidade) {
        openConnection();
        PreparedStatement pst = null;
        Sessao ses = (Sessao) entidade;

        try {
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO sessao (id_ses, id_fxE_ses, id_fil, vm, vi, dti, dtf) VALUES (?, ?, ?, ?)");

            pst = connection.prepareStatement(sql.toString());
            pst.setInt(1, ses.getId());
            pst.setInt(2, ses.getId());
            pst.setInt(3, ses.getId());
            pst.setFloat(4, ses.getValor_meia());
            pst.setFloat(5, ses.getValor_inteira());
            pst.setDate(6, ses.getDt_incio());
            pst.setDate(7, ses.getDt_fim());

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

    public void Alterar(EntidadeDominio entidade) {
        openConnection();
        PreparedStatement pst = null;
        Sessao ses = (Sessao) entidade;

        try {
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE sessao SET id_fxE_ses=?, id_fil=?, vm=?, vi=?, dti=?, dtf=?");
            sql.append("WHERE id_ses=?");

            pst = connection.prepareStatement(sql.toString());
            pst.setInt(1, ses.getId());
            pst.setInt(2, ses.getId());
            pst.setFloat(3, ses.getValor_meia());
            pst.setFloat(4, ses.getValor_inteira());
            pst.setDate(5, ses.getDt_incio());
            pst.setDate(6, ses.getDt_fim());
            pst.setInt(7, ses.getId());

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
    public void Excluir(EntidadeDominio entidade) {
    }

    @Override
    public List<EntidadeDominio> Consultar(EntidadeDominio entidade) {
        openConnection();
        PreparedStatement pst = null;
        Sessao ses = (Sessao) entidade;

        try {
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("SELECT FROM sessao (id_ses, id_fxE_ses, id_fil, vm, vi, dti, dtf) WHERE ?");

            pst = connection.prepareStatement(sql.toString());
            pst.setInt(1, ses.getId());
            pst.setInt(2, ses.getId());
            pst.setInt(3, ses.getId());
            pst.setFloat(4, ses.getValor_meia());
            pst.setFloat(5, ses.getValor_inteira());
            pst.setDate(6, ses.getDt_incio());
            pst.setDate(7, ses.getDt_fim());
            
             
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
}
