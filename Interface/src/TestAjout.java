import DAO.*;
import connection.SConnection;
import utils.Utilisateur;

public class TestAjout {

    public static void main(String[] args) {
        UtilisateurDAO daoUser= new UtilisateurDAO(SConnection.getInstance());
        Utilisateur user = new Utilisateur("Pont", "Fabrice", "fa.pont@gmail.com", "21 BD Gambetta");
        daoUser.create(user);
    }
}
