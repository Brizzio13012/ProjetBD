package utils;

public class Produit {
    private int id;
    private String nom;
    private int prixRevient;
    private int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrixRevient() {
        return prixRevient;
    }

    public void setPrixRevient(int prixRevient) {
        this.prixRevient = prixRevient;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
