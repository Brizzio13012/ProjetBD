package DAO;

import utils.SalleDeVente;
import utils.TypeEnchere;

import java.sql.*;

public class SalleDeVenteDAO extends DAO<SalleDeVente> {
    public SalleDeVenteDAO(Connection conn) {
        super(conn);
    }

    public boolean create(SalleDeVente obj) {
        try {
            PreparedStatement statement = this.connect.prepareStatement("INSERT INTO SalleDeVente (IDSALLE, TYPESALLE, NOMCATEGORIE) VALUES VALUES (?, ?, ?);");
            statement.setInt(1, obj.getIdSalleDeVente());
            statement.setInt(2, obj.getType());
            statement.setString(3, obj.getNomCategorie());
            statement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(SalleDeVente obj) {
        try {
            PreparedStatement statement = this.connect.prepareStatement("DELETE FROM SALLEDEVENTE WHERE IDSALLE=?;");
            statement.setInt(1, obj.getIdSalleDeVente());
            statement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(SalleDeVente obj) {
        return false;
    }

    @Override
    public SalleDeVente find(Object id) {
        SalleDeVente user = new SalleDeVente(1);
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM SalleDeVente WHERE IDSALLE=" + id);
            if(result.first())
                user = new SalleDeVente(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
