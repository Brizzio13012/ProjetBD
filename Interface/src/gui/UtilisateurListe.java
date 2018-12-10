package gui;

import connection.SConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class UtilisateurListe {
    private Vector<Vector<String>> data;
    private Vector<String> entetes;

    public UtilisateurListe(){
        Vector<String> entetes = new Vector<>();
        entetes.add("id");
        entetes.add("Mail");
        entetes.add("Nom");
        entetes.add("Prénom");
        entetes.add("Adresse");
        this.entetes = entetes;
    }

    public Vector<String> getEntetes(){
        return entetes;
    }

    public Vector<Vector<String>> getData() {
        Vector<Vector<String>> data = new Vector<>();
        try {
            PreparedStatement statement = SConnection.getInstance().prepareStatement("SELECT * FROM Utilisateur");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                Vector<String> row = new Vector<>();
                row.add(String.valueOf(result.getRow()));
                row.add(result.getString("email"));
                row.add(result.getString("nom"));
                row.add(result.getString("prenom"));
                row.add(result.getString("adresse"));
                data.add(row);
            }
            return data;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void setData(Vector<Vector<String>> data) {
        this.data = data;
    }
}
