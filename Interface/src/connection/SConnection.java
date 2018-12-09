package connection;

import java.sql.*;


public class SConnection {
    //URL de connexion
    private String url = "jdbc:oracle:thin:@ensioracle1.imag.fr:1521:ensioracle1";
    //Nom du user
    private String user = "leducqt";
    //Mot de passe de l'utilisateur
    private String passwd = "leducqt";
    //Objet connection
    public static Connection connect;

    //Constructeur privé
    private SConnection(){
        try {
            connect = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
    public static Connection getInstance(){
        if(connect == null){
            new SConnection();
        }
        return connect;
    }
}

// Penser à écrire connection.setAutoCommit(false)