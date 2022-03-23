public class TableauBooleens {
    private boolean[] tab;

    public TableauBooleens (boolean[] tb) {this.tab=tb;}
    public boolean get(int i) {...}
    public void set(int i, boolean val) {...}
    public int taille() {
        return this.tab.length;
    }
    public TableauBooleens [] et(TableauBooleens [] tb) {...}
    public boolean et() {

    }

    public String toString() {
        String chaine ="|";

        for(int i = 0;i<this.taille(); i++){
            chaine = chaine + this.get(i) + "|";
    }

        return chaine;
    }
}
