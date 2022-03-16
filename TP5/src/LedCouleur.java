public class LedCouleur extends Led {
    public static final String COULEURS[] = {"ROUGE", "JAUNE", "VERT", "BLEUE"};
    private String couleurs;

    public LedCouleur(){

    }

    public LedCouleur(int reference, boolean etat, String couleurs){
        super(reference, etat);
        this.couleurs = couleurs;
    }

    public String getCouleurs() {
        return couleurs;
    }

    public void setCouleurs(String couleurs) {
        this.couleurs = couleurs;
    }

    public String afficheCouleur(){
        for(String couleur : COULEURS){
            System.out.println(couleur);
        }
        return null;
    }

    @Override
    public String toString() {
        return "LedCouleur{" +
                "couleurs=" + couleurs +
                '}';
    }
}
