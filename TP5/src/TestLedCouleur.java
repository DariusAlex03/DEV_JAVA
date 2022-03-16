public class TestLedCouleur {
    public static void main(String[] args) {
        LedCouleur ledL3 = new LedCouleur(1100, false, "VERT");

        ledL3.allumer();
        System.out.println(ledL3.getEtat());
        System.out.println(ledL3);
        System.out.println(ledL3.afficheCouleur());
        ledL3.setCouleurs("jaune");
        System.out.println(ledL3);
        System.out.println(ledL3.getEtat());
        ledL3.eteindre();
        System.out.println(ledL3.getEtat());

    }
}
