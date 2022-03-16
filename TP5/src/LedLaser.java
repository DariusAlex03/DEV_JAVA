public class LedLaser extends Led{
    public static final double LO_MIN = 1000;   //c'est un seul exemplaire de ca qui reste dans la classe
    public static final double  LO_MAX = 2000;
    private double longueurOnde;

    public LedLaser(){    //default
        super();
    }

    public LedLaser(int reference, boolean etat, double longueurOnde){    //champs a champs
        super(reference, etat);
        this.longueurOnde = longueurOnde;
    }

    public LedLaser(LedLaser l) {
        super(l);    //appel du constructeur par copie de la classe mère

        this.longueurOnde = l.longueurOnde;
    }

    public double getLongueurOnde() {
        return longueurOnde;
    }

    public void setLongueurOnde(double longueurOnde) {
        this.longueurOnde = longueurOnde;
    }

    public boolean isLongururOndeValide(double longueurOnde){
        if(this.longueurOnde >= LO_MIN && this.longueurOnde <= LO_MAX){
            return true;
        }
        return false;
    }

    public String toString() {
        return "Led [etat=" + this.getEtat() + ", reference=" + this.getReference() + ", longueur d'onde = "+ this.getLongueurOnde() + "]";
    }

}
