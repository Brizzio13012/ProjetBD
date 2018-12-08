package utils;

public class TypeEnchere {
    private int id;
    private boolean montante;
    private  boolean revocable;
    private boolean multiple; // Plusieurs enchères ou pas
    private int prixDepart;
    private boolean dureeLimitee;
    private int duree; // Si égal à -1, alors durée illimitée, durée en heure

    public TypeEnchere(int id, boolean montante, boolean revocable, boolean multiple, int prixDepart, boolean dureeLimitee, int duree) {
        this.setId(id);
        this.setMontante(montante);
        this.setRevocable(revocable);
        this.setMultiple(multiple);
        this.setPrixDepart(prixDepart);
        this.setDureeLimitee(dureeLimitee);
        if (!dureeLimitee){
            this.setduree(duree);
        }
        else this.setduree(-1);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMontante() {
        return montante;
    }

    public void setMontante(boolean montante) {
        this.montante = montante;
    }

    public boolean isRevocable() {
        return revocable;
    }

    public void setRevocable(boolean revocable) {
        this.revocable = revocable;
    }

    public boolean isMultiple() {
        return multiple;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public int getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(int prixDepart) {
        this.prixDepart = prixDepart;
    }

    public boolean isDureeLimitee() {
        return dureeLimitee;
    }

    public void setDureeLimitee(boolean dureeLimitee) {
        this.dureeLimitee = dureeLimitee;
    }

    public int getduree() {
        return duree;
    }

    public void setduree(int duree) {
        this.duree = duree;
    }
}
