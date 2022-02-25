import java.util.Locale;
import java.util.Scanner;

public class TestCompteBancaireDeux {
    public static void main(String[] args ){
        CompteBancaireDeux c1 = new CompteBancaireDeux("farida", "1513216F", 100);
        CompteBancaireDeux c2 = new CompteBancaireDeux("toto", "156132132F");

        Scanner scanner = new Scanner(System.in);

        System.out.print(c1.afficher());
        float solde1 = c1.vider();
        float solde2 = c2.vider();
        System.out.println("Le solde de c1 est : " + solde1 + " et le solde de c2 est : "+ c2);

        System.out.print("Entrez un solde que vous desirez affecter a c1 : ");
        float sde = scanner.nextFloat();

        c1.setSolde(sde);

        System.out.print(c1.afficher());

        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = a.toUpperCase(Locale.ROOT);
        System.out.println(b);
    }
}
