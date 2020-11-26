package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import Dominio.EntidadeDominio;
import Dominio.Filme;
import java.sql.Date;

public class FilmeDAO extends AbstractJdbcDAO{
 public FilmeDAO() {
        super("filme", "id_fil");
    }

    public void Inserir(EntidadeDominio entidade) {
        openConnection();
        PreparedStatement pst = null;
        Filme fil = (Filme) entidade;

        try {
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO filme (id_fil, til, es, du, dire, elenco, si) VALUES (?, ?, ?, ?, ?, ?, ?)");

            pst = connection.prepareStatement(sql.toString());
            pst.setInt(1, fil.getId());
            pst.setString(2, fil.getTitulo());
            pst.setDate(3, (Date) fil.getEstreia());
            pst.setDate(4, (Date) fil.getDuracao());
            pst.setString(5, fil.getDiretor());
            pst.setString(6, fil.getElenco());
            pst.setString(7, fil.getSinopse());
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
        Filme fil = (Filme) entidade;

        try {
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE filme SET til=?, es=?, du=?, dire=?, elenco=?, si=?");
            sql.append("WHERE id_fil=?");

            pst = connection.prepareStatement(sql.toString());
            pst.setString(1, fil.getTitulo());
            pst.setDate(2, (Date) fil.getEstreia());
            pst.setDate(3, (Date) fil.getDuracao());
            pst.setString(4, fil.getDiretor());
            pst.setString(5, fil.getElenco());
            pst.setString(6, fil.getSinopse());
            pst.setInt(7, fil.getId());
            
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
        Filme fil = (Filme) entidade;

        try {
            connection.setAutoCommit(false);

            StringBuilder sql = new StringBuilder();
            sql.append("SELECT FROM filme (id_fil, til, es, du, dire, elenco, si) WHERE ?");

            pst = connection.prepareStatement(sql.toString());
            pst.setInt(1, fil.getId());
            pst.setString(2, fil.getTitulo());
            pst.setDate(3, (Date) fil.getEstreia());
            pst.setDate(4, (Date) fil.getDuracao());
            pst.setString(5, fil.getDiretor());
            pst.setString(6, fil.getElenco());
            pst.setString(7, fil.getSinopse());
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