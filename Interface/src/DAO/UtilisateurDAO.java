package DAO;

import utils.Utilisateur;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilisateurDAO extends DAO<Utilisateur> {
    public UtilisateurDAO(Connection conn) {
        super(conn);
    }

    public boolean create(Utilisateur obj) {
        try {
            Statement state = this.connect.createStatement();
            String values = "("+ obj.getMail()+", "+obj.getNom()+", "+obj.getPrenom()+", "+obj.getAdresse()+")";
            state.executeQuery("INSERT INTO Utilisateur (EMAIL, NOM, PRENOM, ADRESSE) VALUES "+values+";");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(Utilisateur obj) {
        try {
            Statement state = this.connect.createStatement();
            String condition = "Email=" + "'" + obj.getMail() + "'";
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
        Utilisateur user = new Utilisateur("random", "random", (String) email, "random");
        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Utilisateur WHERE email = " + email);
            if(result.first())
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

