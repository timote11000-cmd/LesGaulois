package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();
	
	public Druide(String nom, int force) {
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
	    return "Le druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
        chaudron.remplirChaudron(quantite, forcePotion);
    }
	
	public void booster(Gaulois gaulois) {
	    if (gaulois.getNom().equals("Obélix")) {
	        parler("Non, Obélix ! Tu es tombé dedans quand tu étais petit !");
	    } else {
	        if (chaudron.resterPotion()) {
	            int forcePotion = chaudron.prendreLouche();
	            gaulois.boirePotion(forcePotion);
	        } else {
	            parler("Désolé, je n'ai plus de potion !");
	        }
	    }
	}
	
}