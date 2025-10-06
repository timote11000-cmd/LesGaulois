package personnages;

public class Druide {
    private String nom;
    private int force;
    private int nbDoses;
    private int effetDose;
    private Chaudron chaudron;

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
        return "Le Druide " + nom + " : ";
    }

    public void fabriquerPotion(int nbDoses, int effetDose) {
        this.nbDoses = nbDoses;
        this.effetDose = effetDose;
        parler("J'ai concocté " + nbDoses + " doses de potion magique. Elle a une force de " + effetDose + ".");
    }

    public void remplirChaudron(Chaudron chaudron) {
        this.chaudron = chaudron;
        this.chaudron.remplir(nbDoses);
    }

    public void boosterGaulois(Gaulois g) {
        if (g.getNom().equals("Obélix")) {
            parler("Non, Obélix Non !... Et tu le sais très bien !");
            return;
        }
        if (chaudron != null && chaudron.resterPotion()) {
            g.boirePotion(effetDose);
            chaudron.retirerDose();
            parler("Tiens " + g.getNom() + " un peu de potion magique.");
        }
    }
}