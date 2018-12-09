package utils;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String mail;
    private String adresse;

    public Utilisateur(String nom, String prenom, String mail, String adresse) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setMail(mail);
        this.setAdresse(adresse);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
