public class TestLedLaser {

    public static void main(String[] args) {
        LedLaser ledL1 = new LedLaser(6832, true , 1300);
        ledL1.allumer();
        System.out.println(ledL1.getEtat());
        ledL1.setLongueurOnde(500);
        System.out.println(ledL1);
        ledL1.clignoter();
        System.out.println(ledL1.isLongururOndeValide(500));
        ledL1.eteindre();
    }
}