package Application;

import Noeud.Noeud;
import Noeud.NoeudSujet;
import Noeud.NoeudObservateur;

public class TestObservateur {
    public static void main(String[] args) {
        NoeudSujet noeudSujet = new NoeudSujet("n0", 1, 2);
        System.out.println(noeudSujet.toString());
        NoeudObservateur no1 = new NoeudObservateur("n1", 0, 1);
        noeudSujet.enregistrerObservateur(no1);
        NoeudObservateur no2 = new NoeudObservateur("n2", 0, 4 );
        noeudSujet.enregistrerObservateur(no2);
        NoeudObservateur no3 = new NoeudObservateur("n3", 0, 5);
        noeudSujet.enregistrerObservateur(no3);
        noeudSujet.majValeur(6);
        noeudSujet.notifierObservateur();
        System.out.println(noeudSujet.toString());
        System.out.println(no1.toString());
        System.out.println(no2.toString());
        System.out.println(no3.toString());
    }
}
