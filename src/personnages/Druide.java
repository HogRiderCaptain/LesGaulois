package personnages;
import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a " + effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		Random random = new Random(); 
		forcePotion = random.nextInt(effetPotionMax + 1);
		while (forcePotion < 5) {
			forcePotion = random.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
		}
		
		
		if (forcePotion > 7) {
			parler("<< J'ai prepare une super potion de force " + forcePotion + " >>");
			
		} else {
			parler("<< Je n'ai pas trouve tous les ingredients, ma potion est seulement de force " + forcePotion + " >>");			
		}
	}
	
	public void booster(Gaulois gaulois) {
		if (!"Obelix".equals(gaulois.getNom())) {
			gaulois.boirePotion(forcePotion);
		}
		else {
			parler("Non, Obelix ! Tu n'auras pas de potion magique !");
		}
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		
	}
	
}
