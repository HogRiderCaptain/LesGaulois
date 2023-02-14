package personnages;

public class Gaulois{
	private String nom;
	private int force;
	private int effetPotion=1;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public int getForce() {
		return force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
	}
		@Override
	public String toString() {
			return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
		System.out.println(asterix.getNom());
		
		System.out.println(asterix);
		System.out.println(asterix.getNom());
		
		System.out.println(asterix);
		System.out.println(asterix.getNom());
	}
}