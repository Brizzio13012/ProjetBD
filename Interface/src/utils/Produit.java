package utils;

public class Produit {
    private int idProduit;
    private String nomProduit;
    private float prixRevient;
    private int stock;
    private String nomCategorie;
    private String emailVendeur;

    public Produit(int idProduit, String nomProduit, float prixRevient, int stock, String nomCategorie, String emailVendeur) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.prixRevient = prixRevient;
        this.stock = stock;
        this.nomCategorie = nomCategorie;
        this.emailVendeur = emailVendeur;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public float getPrixRevient() {
        return prixRevient;
    }

    public void setPrixRevient(float prixRevient) {
        this.prixRevient = prixRevient;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getEmailVendeur() {
        return emailVendeur;
    }

    public void setEmailVendeur(String emailVendeur) {
        this.emailVendeur = emailVendeur;
    }
}
