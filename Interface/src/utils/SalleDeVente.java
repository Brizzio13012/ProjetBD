package utils;


public class SalleDeVente {
    private int idSalleDeVente;
    private int type;
    private String nomCategorie;

    public SalleDeVente(int type) {
        setType(type);
    }

    public String getIdSalleDeVente() { return idSalleDeVente; }

    public void setIdSalleDeVente(int idSalleDeVente) { this.idSalleDeVente = idSalleDeVente; }

    public String getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
}
