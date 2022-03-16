/**
 * 
 * @author bouchaiblemaire
 * Led  V.1.1
 * Classe modélisant une led
 * 
 * Reproduction interdite sans l'autorisation del'auteur
 */

public class Led {
	private int reference;   // Reference de la Led
	private boolean etat;	// Etat de la Led allumee ou eteinte

	/**
	 * Constructeur par defaut
	 */
	public Led(){
	}

	/**
	 * Constructeur d'initialisation champ à champ
	 * @param reference : reference de la Led
	 * @param etat	: etat de la Led allumee ou eteinte
	 */

	public Led(int reference, boolean etat){
		this.reference = reference;
		this.etat = etat;
	}

	/**
	 * Constructeur par copie
	 * @param uneLed (Led)
	 */
	public Led(Led uneLed){
		this.reference = uneLed.getReference();
		this.etat = uneLed.getEtat();	
	}

	/**
	 * Accesseur pour la référence (code) de la led
	 * @return (int)
	 */
	public int getReference() {
		return reference;
	}

	/**
	 * mutateur pour la référence (code) de la led
	 * @param reference (int)
	 */
	public void setReference(int reference) {
		this.reference = reference;
	}

	/**
	 * Accesseur pour l'état de la led
	 * @return (boolean) : true pour allumé, false sinon
	 */
	public boolean getEtat() {
		return etat;
	}

	/**
	 * Mutateur pour l'état de la led
	 * @param etat (boolean)
	 */
	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	/**
	 * Allume la Led
	 */
	public void allumer(){
		this.etat = true;
	}
	
	/**
	 * Eteint la Led
	 */
	public void eteindre(){
		this.etat = false;
	}

	/**
	 * Fait clignoter une fois la Led une fois
	 * Inverse l'etat de la Led
	 */
	
	public void clignoter(){
		this.etat = !this.etat;
	}

	/**
	 * toString
	 * @return (String)
	 */
	public String toString() {
		return "Led [etat=" + this.getEtat() + ", reference=" + this.getReference() + "]";
	}
}
