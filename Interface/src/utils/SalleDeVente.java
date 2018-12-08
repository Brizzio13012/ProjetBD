package utils;


import java.util.LinkedList;

public class SalleDeVente {
    private TypeEnchere type;
    private LinkedList<Vente> listeVentes;

    public SalleDeVente(TypeEnchere type) {
        listeVentes = new LinkedList<Vente>();
        setType(type);
    }

    public TypeEnchere getType() {
        return type;
    }

    public void setType(TypeEnchere type) {
        this.type = type;
    }

    public LinkedList<Vente> getListeVentes() {
        return listeVentes;
    }

    public void setListeVentes(LinkedList<Vente> listeVentes) {
        this.listeVentes = listeVentes;
    }
}
