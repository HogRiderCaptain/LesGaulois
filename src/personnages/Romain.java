package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private static int nbEquipement = 0;

	public Romain(String nom, int force) {
		super();
		assert force > 0;
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int forceInit = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		
		assert force < forceInit;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est deja bien protege !");
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possede deja un " + equipement.toString() + " !");
				break;
			} else {
				ajoutEquipement(equipement);
				break;
			}
		case 0:
			ajoutEquipement(equipement);
			break;
		}
	}

	private void ajoutEquipement(Equipement equipement) {
		System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement.toString() + ".");
		equipements[nbEquipement] = equipement;
		nbEquipement++;
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		
	}
}