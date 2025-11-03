package personnages;

public class Village {
    String nom;
    int nbVillageoisMax;
    int nbVillageois;
    Gaulois[] villageois;

    public Village(String nom, int nbVillageoisMax) {
        this.nom = nom;
        this.nbVillageoisMax = nbVillageoisMax;
        this.nbVillageois = 0;
        this.villageois = new Gaulois[nbVillageoisMax];
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < nbVillageoisMax) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
        }
    }

    public Gaulois trouverVillageois(int numero) {
        if (numero >= 1 && numero <= nbVillageois) {
            return villageois[numero - 1];
        } else {
            System.out.println("Il n’y a pas autant d’habitants dans notre village !");
            return null;
        }
    }

    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" vivent les légendaires gaulois :");
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }
}
