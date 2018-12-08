package utils;

import java.sql.Time;
import java.util.Date;

public class Enchere {
    private float prix;
    private Date date;
    private Time heure;
    private int quantite;

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHeure() {
        return heure;
    }

    public void setHeure(Time heure) {
        this.heure = heure;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantité) {
        this.quantite = quantité;
    }


}
