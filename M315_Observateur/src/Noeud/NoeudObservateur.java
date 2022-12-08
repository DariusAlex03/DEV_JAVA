package Noeud;

import Observable.Observateur;

public class NoeudObservateur extends Noeud implements Observateur {
    public NoeudObservateur(String unNom, int c, int v){
        super(unNom, c, v);
    }

    @Override
    public void actualiser(int uneValeur) {
        this.majValeur(uneValeur);
    }
}
