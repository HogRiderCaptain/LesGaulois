package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}


	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
				Equipement newtrophee[] = romain.recevoirCoup((force/3)*effetPotion);
		for (int i = 0; newtrophee != null && i < newtrophee.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = newtrophee[i];
		}
	}

	public String toString() { return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]"; 
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("<< Merci Druide, je sens que ma force est " + effetPotion + " fois decuplee.");

	}


	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain cesar = new Romain("Cesar", 20);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.parler("hello");
		asterix.frapper(cesar);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		asterix.boirePotion(4);
		asterix.frapper(cesar);


	}
}


