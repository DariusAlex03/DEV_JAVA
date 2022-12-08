package Noeud;

public class Noeud {
    private String nom;
    private int coef;
    private int valeur;

    public Noeud(String n, int c, int v){
        this.nom = n;
        this.coef = c;
        this.valeur = v;
    }

    public String getNom() {
        return nom;
    }

    public int getCoef() {
        return coef;
    }

    public int getValeur() {
        return valeur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "Nom : " + this.getNom() + " coef : " + this.getCoef() + " et valeur : " + this.getValeur();
    }

    public void majValeur(int v){
        int res = this.getValeur() + v * this.getCoef();
        this.setValeur(res);
    }
}
