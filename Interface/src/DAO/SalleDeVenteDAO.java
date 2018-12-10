package DAO;

import utils.SalleDeVente;

import java.sql.*;

public class SalleDeVenteDAO extends DAO<SalleDeVente> {
    public SalleDeVenteDAO(Connection conn) {
        super(conn);
    }

    public boolean create(SalleDeVente obj) {
        try {
            PreparedStatement statement = this.connect.prepareStatement("INSERT INTO SalleDeVente (IDSALLE, TYPESALLE, NOMCATEGORIE) VALUES VALUES (?, ?, ?);");
            statement.setInt(1, obj.getIdSalle());
            statement.setInt(2, obj.getType());
            statement.setString(3, obj.getNomCat());
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
            statement.setInt(1, obj.getIdSalle());
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
        SalleDeVente salle = null;
        try {
            PreparedStatement statement = this.connect.prepareStatement("SELECT * FROM SALLEDEVENTE WHERE IDSALLE = ?");
            statement.setString(1, String.valueOf(id));
            ResultSet result = statement.executeQuery();
            if(result.next())
                salle = new SalleDeVente(
                        (int) id,
                        result.getInt("typeSalle"),
                        result.getString("nomCategorie")
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return salle;
    }
}
