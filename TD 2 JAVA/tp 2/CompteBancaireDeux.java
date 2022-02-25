public class CompteBancaireDeux {
    private String nom;
    private String numero;
    private float solde;

    public CompteBancaireDeux(String nomC, String numeroC, float soldeC){
        this.nom = nomC;
        this.solde = soldeC;
        this.numero = numeroC;
    }

    public CompteBancaireDeux(String nomC, String numeroC){
        this.nom = nomC;
        this.numero = numeroC;
    }

    public char affiche(){
        System.out.print("nom : " + this.nom + " numero : " + this.numero);
        return 0;
    }

    public float vider(){
        return 2;
    }

    public void afficher(){
        return;
    }
}
