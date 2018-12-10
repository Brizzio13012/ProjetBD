import DAO.*;
import connection.SConnection;
import utils.*;

import java.sql.Date;
import java.sql.SQLException;

public class TestAjout {

    public static void main(String[] args) throws SQLException {
        Date actuelle = new Date(1000);

        //UtilisateurDAO daoUser= new UtilisateurDAO(SConnection.getInstance());
        //Utilisateur user = new Utilisateur("Bombeur", "Jean", "jean.bombeur@yahoo.fr", "18 rue Hébert Grenoble");
        //daoUser.create(user);

        //CategorieProduitDAO daoCatProd= new CategorieProduitDAO(SConnection.getInstance());
        //CategorieProduits catProd = new CategorieProduits("Voiture", "Toutes les voitures disponibles au encheres");
        //daoCatProd.create(catProd);

        //SalleDeVenteDAO daoSdVente = new SalleDeVenteDAO(SConnection.getInstance());
        //SalleDeVente salle = new SalleDeVente(1, 1, "Voiture");
        //daoSdVente.create(salle);

        //ProduitDAO daoProd = new ProduitDAO(SConnection.getInstance());
        //Produit prod = new Produit(1, "Fiat Panda", 100, 10, "Voiture", "jean.bombeur@yahoo.fr");
        //daoProd.create(prod);

        //VenteDAO daoVente = new VenteDAO(SConnection.getInstance());
        //Vente sell = new Vente(1234, actuelle, false, 1, 1);
        //daoVente.create(sell);
    }
}
