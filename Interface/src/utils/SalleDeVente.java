package utils;

public class SalleDeVente {
    private int idSalle;
    private int type;
    private String nomCat;

    public SalleDeVente(int idSalle, int type, String nomCat) {
        setIdSalle(idSalle);
        setType(type);
        setNomCat(nomCat);
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
