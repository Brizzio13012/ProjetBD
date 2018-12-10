package DAO;

import utils.Vente;

import java.sql.*;

public class VenteDAO extends DAO<Vente> {

    public VenteDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Vente obj) {
        try {
            PreparedStatement statement = this.connect.prepareStatement("INSERT INTO VENTE (IDVENTE, DATEMISEENACTIVITE, FINIEOUPAS, SALLE, PRODUITPROPOSE) VALUES ( ?, ?, ?, ?, ?)");
            statement.setInt(1, obj.getIdVente());
            statement.setDate(2, (Date) obj.getDateMiseEnActivite());
            statement.setBoolean(3, obj.getFinieOuPas());
            statement.setInt(4, obj.getSalle());
            statement.setInt(5, obj.getProduitPropose());
            statement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Vente obj) {
        return false;
    }

    @Override
    public boolean update(Vente obj) {
        return false;
    }

    @Override
    public Vente find(Object idVente) {
        Vente vente = null;
        try {
            PreparedStatement statement = this.connect.prepareStatement("SELECT * FROM Vente WHERE idVente = ?");
            statement.setString(1, String.valueOf(idVente));
            ResultSet result = statement.executeQuery();
            if(result.next())
                vente = new Vente(
                        (int) idVente,
                        result.getDate("dateMiseEnActivite"),
                        result.getBoolean("finieOuPas"),
                        result.getInt("SALLE"),
                        result.getInt("Produitpropose")
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vente;
    }
}
