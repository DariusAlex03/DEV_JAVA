public class LedLaser extends Led{
    private double longueurOnde;

    public LedLaser(int reference, boolean etat, double longueurOnde){
        super(reference, etat);
        this.longueurOnde = longueurOnde;
    }

    public double getLongueurOnde() {
        return longueurOnde;
    }

    public void setLongueurOnde(double longueurOnde) {
        this.longueurOnde = longueurOnde;
    }

    public String toString() {
        return "Led [etat=" + this.getEtat() + ", reference=" + this.getReference() + ", longueur d'onde = "+ this.getLongueurOnde() + "]";
    }

}
