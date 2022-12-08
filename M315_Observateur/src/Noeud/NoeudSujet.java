package Noeud;

import Observable.Observateur;
import Observable.Sujet;

import java.util.ArrayList;

public class NoeudSujet extends Noeud implements Sujet {
    private ArrayList<Observateur> observateurs;


    public NoeudSujet(String n, int c, int v) {
        super(n, c, v);
        this.observateurs = new ArrayList<Observateur>();
    }

    @Override
    public void enregistrerObservateur(Observateur o) {
        this.observateurs.add(o);
    }

    @Override
    public void supprimerObservateur(Observateur o) {
        this.observateurs.remove(o);
    }

    @Override
    public void notifierObservateur() {
        for (int i = 0; i < this.observateurs.size(); i++) {
            this.observateurs.get(i).actualiser(this.getValeur());
        }
    }

    public void changementValeur(int uneValeu){
        this.majValeur(uneValeu);
        this.notifierObservateur();
    }
}
