package personnages;

public class Druide {
    private String nom;
    private int force;

    public Druide(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    private String prendreParole() {
        return "Le Druide " + nom + " : ";
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    public void fabriquerPotion(int nombreDeDose) {
        parler("J’ai concocté " + nombreDeDose + " doses de potion magique.");
    }

    public void boosterGaulois(Gaulois gaulois) {
        if (gaulois.getNom().equals("Obélix")) {
            parler("Non, Obélix Non !... Et tu le sais très bien !");
        } else {
            gaulois.boirePotion(3); 
            parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
        }
    }
}
