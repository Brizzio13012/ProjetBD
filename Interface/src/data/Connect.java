package data;

import java.sql.*;

//CTRL + SHIFT + O pour générer les imports
public class Connect {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Driver O.K.");

            String url = "jdbc:oracle:thin:@ensioracle1.imag.fr:1521:ensioracle1";
            String user = "pontf";
            String passwd = "pontf";

            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}