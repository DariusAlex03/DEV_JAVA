public class TestBanque {
    public static void main(String[] args) {
        AgenceBancaire ab = new AgenceBancaire("BNP", "Villetaneuse");
        CompteBancaire cb1 = new CompteBancaire("Gerard" , "2131231872");
        CompteBancaire cb2 = new CompteBancaire("Myriam", 200, "88798D987");
        CompteBancaire cb3 = new CompteBancaire("Pierre" , 150, "8879423487");
        CompteBancaire cb4 = new CompteBancaire("Alex" , 100, "2313D43424");


        System.out.println(ab);
        System.out.println(cb1);
        System.out.println(cb4);

        ab.ajoute(cb1);
        ab.ajoute(cb2);
        ab.ajoute(cb3);
        ab.ajoute(cb4);

        System.out.println(ab);

        System.out.println(ab.comptePersonneExiste("Pierre"));

        System.out.println(ab.lesComptesDe("Pierre"));
    }
}
