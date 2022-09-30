package personnages;

public class Druide {

	private String nom;
	private int effetPotionMin;
	private int efffePotionMax;

	public Druide(String nom, int effetPotionMin, int efffePotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.efffePotionMax = efffePotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + this.effetPotionMin + 
				" à " + this.efffePotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	private String prendreParole() {
		return " Le druide " + nom + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}

}
