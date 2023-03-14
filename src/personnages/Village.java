package personnages;

public class Village {
	
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int i) {
		return villageois[i];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef + "vivent les legendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	
	public static void main(String[] args){
		Village village = new Village("Village des Irreductibles", 30);
		
		//Gaulois gaulois = village.trouverHabitant(30);
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
		// L'index maximal d'un tableau de taille 30 est 29.
		
		
		 /*
		 Chef abraracourcix = new Chef("Abraracourcix", 8, 1, village);
		 Gaulois asterix = new Gaulois("Asterix", 8);
		 village.ajouterHabitant(asterix);
		 Gaulois gaulois = village.trouverHabitant(1);
		 System.out.println(gaulois);
		 */
		 //On obtient null car asterix est a l'indice 0
		
		Chef abraracourcix = new Chef("Abraracourcix", 8, 1, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
		
		
	}
	
}
