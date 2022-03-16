import java.util.Locale;

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

    public float vider(){
        float montant = this.solde;
        this.solde = 0;
        return montant;
    }

    public float setSolde(float sol){
        this.solde = sol;
        return sol;
    }

    public String creeNumero(){
       String a = "abcdefghijklmnopqrstuvwxyz";
       String b = a.toUpperCase(Locale.ROOT);
       System.out.println(b);
        return a;
    }

    public char afficher(){
        System.out.println("nom : " + this.nom + " numero : " + this.numero + " et solde : " + this.solde);
        return 0;
    }
}
