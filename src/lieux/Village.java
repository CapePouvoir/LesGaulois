package lieux;

import personnages.Chef;
import personnages.Gaulois;

public class Village {

	public String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.nbVillageois = 0;
		this.nom = nom;
	}

	public void ajouterHabitant(Gaulois habitant) {
		villageois[nbVillageois] = habitant;
		nbVillageois++;
	}

	public Gaulois trouverHabitant(int i) {
		return villageois[i];
	}

	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois: ");
		for (Gaulois i : villageois) {
			System.out.println(" - " + i);
		}
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public static void main(String[] args) {
		Village v = new Village("Village des Irréductibles", 30);
		// Gaulois gaulois = village.trouverHabitant (30);
		//

		Chef c = new Chef("Abraracourcix", 6, v);
		v.setChef(c);

		Gaulois Astérix = new Gaulois("Astérix", 8);
		v.ajouterHabitant(Astérix);

		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		//

		Gaulois Obélix = new Gaulois("Obélix", 25);
		v.ajouterHabitant(Obélix);

		v.afficherVillageois();

	}
}
