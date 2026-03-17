package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbvillageoisMax = 10;
	private int nbVillageois = 0;
	private Gaulois[] villageois = new Gaulois[nbvillageoisMax];
	private Gaulois chef;

	public Village(String nom, int nbvillageoisMax, Gaulois chef) {
		this.nom = nom;
		this.chef = chef;
		this.nbvillageoisMax = nbvillageoisMax;
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < nbvillageoisMax) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois >= 0 && numVillageois < nbVillageois) {
			return villageois[numVillageois];
		}

	public void afficherVillage() {
		return;
	}
	
	public static void main(String args[]) {
		Gaulois abrearacourcix = new Gaulois("abrearacourcix", 6);
		Village village = new Village("Village des Indestructibles", 30, abrearacourcix);
		village.trouverVillageois(30);
		
		Gaulois asterix = new Gaulois("asterix", 8);
		village.ajouterVillageois(asterix);
		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);	
	}
	

}
