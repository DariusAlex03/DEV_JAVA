
/**
 *  utilisation de classes existantes
 *  @author Françoise GAYRAL
 */

import java.util.*;
public class TestUtilisationClasses
{
  public static void main(String[] args)	{
	// Pour l'exo B.1 sur les chaînes : utilisation de la classe String
	String sb = "Bonjour tout le monde ";
	String m = new String("monde");
	String mb = ("    monde        "); //4 blancs au départ, 8 blancs à la fin
	String me = "et merci";
	String subminus = sb.toLowerCase();
	Scanner scanner = new Scanner(System.in);

	// à compléter

	  System.out.print("entrez un nombre : ");
	  int nombre1 = scanner.nextInt();
	  System.out.println("Le premier nombre est : " + nombre1);

	  System.out.print("Entrez un second nombre : ");
	  int nombre2 = scanner.nextInt();
	  System.out.println("Le second nombre est : " + nombre2);

	  int somme  = nombre1 + nombre2;
	  System.out.println("La somme des deux nombres est : "+ somme );


  }	// fin du main
}// fin de la classe TestUtilisationClasses
