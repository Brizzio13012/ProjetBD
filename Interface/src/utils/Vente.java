package utils;

import java.util.Date;

public class Vente {
    private int idVente;
    private Date dateMiseEnActivite;
    private boolean finieOuPas;
    private int salle;
    private int produitPropose;

    public Vente(int idVente, Date dateMiseEnActivite, boolean finieOuPas, int salle, int produitPropose) {
        this.idVente = idVente;
        this.dateMiseEnActivite = dateMiseEnActivite;
        this.finieOuPas = finieOuPas;
        this.salle = salle;
        this.produitPropose = produitPropose;
    }

    public int getIdVente() {
        return idVente;
    }

    public void setIdVente(int idVente) {
        this.idVente = idVente;
    }

    public Date getDateMiseEnActivite() {
        return dateMiseEnActivite;
    }

    public void setDateMiseEnActivite(Date dateMiseEnActivite) {
        this.dateMiseEnActivite = dateMiseEnActivite;
    }

    public boolean getFinieOuPas() {
        return finieOuPas;
    }

    public void setFinieOuPas(boolean finieOuPas) {
        this.finieOuPas = finieOuPas;
    }

    public int getSalle() {
        return salle;
    }

    public void setSalle(int salle) {
        this.salle = salle;
    }

    public int getProduitPropose() {
        return produitPropose;
    }

    public void setProduitPropose(int produitPropose) {
        this.produitPropose = produitPropose;
    }
}
