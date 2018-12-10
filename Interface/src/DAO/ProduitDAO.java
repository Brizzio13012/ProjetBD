package DAO;

import utils.Produit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProduitDAO extends DAO<Produit> {

    public ProduitDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Produit obj) throws SQLException {
        try {
            PreparedStatement statement = this.connect.prepareStatement("INSERT INTO PRODUIT (IDPRODUIT, NOMPRODUIT, PRIXREVIENT, STOCK, NOMCATEGORIE, EMAILVENDEUR) VALUES ( ?, ?, ?, ?, ?, ?)");
            statement.setInt(1, obj.getIdProduit());
            statement.setString(2, obj.getNomProduit());
            statement.setFloat(3, obj.getPrixRevient());
            statement.setInt(4, obj.getStock());
            statement.setString(5, obj.getNomCategorie());
            statement.setString(6, obj.getEmailVendeur());
            statement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Produit obj) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Produit obj) {
        return false;
    }

    @Override
    public Produit find(Object idProd) {
        Produit prod = null;
        try {
            PreparedStatement statement = this.connect.prepareStatement("SELECT * FROM PRODUIT WHERE  IDPRODUIT= ?");
            statement.setInt(1, (Integer) idProd);
            ResultSet result = statement.executeQuery();
            if(result.next())
                prod = new Produit(
                        (Integer) idProd,
                        result.getString("nomProduit"),
                        result.getInt("prixRevient"),
                        result.getInt("stock"),
                        result.getString("nomCategorie"),
                        result.getString("emailVendeur")
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prod;
    }
}
