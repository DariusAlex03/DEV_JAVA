public class TestLedLaser {

    public static void main(String[] args) {
        LedLaser ledL1 = new LedLaser(6832, true , 1300);
        System.out.println(ledL1.getEtat());
        ledL1.setLongueurOnde(500);
        System.out.println(ledL1);
    }
}
