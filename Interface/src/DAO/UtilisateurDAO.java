package DAO;

import utils.Utilisateur;

import java.sql.*;

public class UtilisateurDAO extends DAO<Utilisateur> {
    public UtilisateurDAO(Connection conn) {
        super(conn);
    }

    public boolean create(Utilisateur obj) {
        try {
            PreparedStatement statement = this.connect.prepareStatement("INSERT INTO Utilisateur (EMAIL, NOM, PRENOM, ADRESSE) VALUES ( ?, ?, ?, ?)");
            statement.setString(1, obj.getMail());
            statement.setString(2, obj.getNom());
            statement.setString(3, obj.getPrenom());
            statement.setString(4, obj.getAdresse());
            statement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Utilisateur obj) {
        try {
            Statement state = this.connect.createStatement();
            String condition = "EMAIL=" + "'" + obj.getMail() + "'";
            state.executeQuery("DELETE FROM Utilisateur WHERE " + condition);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Utilisateur obj) {
        return false;
    }

    @Override
    public Utilisateur find(Object email) {
        Utilisateur user = null;
        try {
            PreparedStatement statement = this.connect.prepareStatement("SELECT * FROM Utilisateur WHERE email = ?");
            statement.setString(1, String.valueOf(email));
            ResultSet result = statement.executeQuery();
            if(result.next())
                user = new Utilisateur(
                        result.getString("nom"),
                        result.getString("prenom"),
                        (String) email,
                        result.getString("adresse")
                        );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}

