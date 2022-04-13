import java.util.*;

public class AgenceBancaire {
    private String nom;
    private String ville;
    private ArrayList<CompteBancaire> ensCompteBancaire;

    public AgenceBancaire (String nom, String ville){
        this.nom = nom;
        this.ville = ville;
        this.ensCompteBancaire = new ArrayList<CompteBancaire>();
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public ArrayList<CompteBancaire> getEnsCompteBancaire() {
        return ensCompteBancaire;
    }
    public void setEnsCompteBancaire(ArrayList<CompteBancaire> ensCompteBancaire) {
        this.ensCompteBancaire = ensCompteBancaire;
    }

    public void ajoute(CompteBancaire cb){
        if(this.compteExiste(cb)){
            System.out.println("Desolé, mais le compte " + cb + " existe déja dans la liste de comptes");
        }
        else {
            this.ensCompteBancaire.add(cb);
        }
    }

    public boolean compteExiste(CompteBancaire cb){
        return this.ensCompteBancaire.contains(cb)== true;
    };

    public boolean comptePersonneExiste(String noms) {
        for (CompteBancaire c : this.ensCompteBancaire){
            if(c.getNom().equals(noms)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<CompteBancaire> lesComptesDe(String noms) {
        ArrayList compte = new ArrayList<>();
        for (CompteBancaire c : this.ensCompteBancaire) {
            if (c.getNom().equals(noms)) {
                compte.add(c);
            }
        }
        return compte;
    }

    @Override
    public String toString() {
        String s = "Agence bancaire : " + this.nom + ", " + this.ville + " ; ";
        for(CompteBancaire cb : this.ensCompteBancaire){
            s = s + cb.toString() + "\n";
        }
        return s;
    }
    /*
    Aussi une autre méthode toString serait de faire comme cela :
    for(int i = 0; i < this.ensCompteBancaire.size(); i++){
        s = s + this.ensCompteBancaire.get(i) + "\n";
    }
     */
}
