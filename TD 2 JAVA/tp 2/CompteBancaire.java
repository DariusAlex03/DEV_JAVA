
public class CompteBancaire {

    private String nom;
    private float solde;
    private String num;

   /**
   * Constructeurs
   */
    public CompteBancaire(String nomC, float soldeC, String numC)
    {
        this.nom = nomC;
        this.solde = soldeC;
        this.num = numC;
    }

    public CompteBancaire(String nomC, String numC) {
        this.nom = nomC;
        this.solde = 0f;
        this.num = numC;
    }

    // getters setters

    public String getNom() {
        return this.nom;
    }

    public float getSolde() {
        return this.solde;
    }

    public String getnum(){
        return this.num;
    }

    public void setNom(String nouvNom) {
        if (!nom.equals(""));
            this.nom=nouvNom;
    }

    public void setSolde(float nouvSolde) {
        this.solde=nouvSolde;
    }

   /**
   * ajoute 'ajout 'au solde si 'ajout' est positif et retourne true, sinon retourne false
   */


    /**
   * retire 'retrait' au solde si 'retrait' est positif et retourne true, retourne false si 'retrait' est négatif
   */

   /**
   * test si deux comptes ont memes proprietaires

   * transfert d'un compte sur un autre pour un meme proprietaire
   * le compte passé en parametre est receveur du transfert
   * la valeur est donc positive
   * renvoie faux si erreur
   * vrai si le tranfert est effectué
   * fait des affichages appropriés dans le cas d'un retour à false (3 cas)
   */



   /*
   * retourne la conversion du solde du compte dans une monnaie dont le taux de change est passé en paramètre
   */


}