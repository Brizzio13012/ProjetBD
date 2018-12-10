package DAO;

import utils.CategorieProduits;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategorieProduitDAO extends DAO<CategorieProduits> {

    public CategorieProduitDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(CategorieProduits obj) throws SQLException {
        try {
            PreparedStatement statement = this.connect.prepareStatement("INSERT INTO CATEGORIEPRODUIT (NOM, DESCRIPTIONCATPRODUIT) VALUES ( ?, ?)");
            statement.setString(1, obj.getNom());
            statement.setString(2, obj.getDescription());
            statement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(CategorieProduits obj) throws SQLException {
        return false;
    }

    @Override
    public boolean update(CategorieProduits obj) {
        return false;
    }

    @Override
    public CategorieProduits find(Object nom) {
        CategorieProduits catProd = null;
        try {
            PreparedStatement statement = this.connect.prepareStatement("SELECT * FROM CATEGORIEPRODUIT WHERE  NOM= ?");
            statement.setString(1, String.valueOf(nom));
            ResultSet result = statement.executeQuery();
            if(result.next())
                catProd = new CategorieProduits(
                        (String) nom,
                        result.getString("DESCRIPTIONCATPRODUIT")
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return catProd;
    }
}
