package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
	    return "Le gaulois " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		
		System.out.println(asterix.getNom());
	}
	
	@Override
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}

	public void frapper(Romain romain) {
	    System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	    
	    int forceCoup = (force * effetPotion) / 3; 
	    romain.recevoirCoup(forceCoup);
	}
	
	public void boirePotion(int forcePotion) {
	    this.effetPotion = forcePotion;
	    parler("Merci Druide, je sens ma force décuplée par " + effetPotion + " !");
	}
}