package personnages;

public class Romain {
    private String nom;
    private int force;

    public Romain(String nom, int force) {
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
        return "Le Romain " + nom + " : ";
    }

    public void recevoirCoup(int forceCoup) {
        //Précondition
        assert force > 0 : "Erreur : la force du Romain doit être positive avant le coup.";
        assert forceCoup > 0 : "Erreur : la force du coup doit être positive.";

        int forceAvant = force;

        //Traitement
        force = force - forceCoup;

        //Postconditions
        assert force <= forceAvant : "Erreur : la force n’a pas diminué après le coup.";
        assert force >= 0 : "Erreur : la force ne peut pas être négative.";

        if (force < 1) {
            force = 0;
            parler("J'abandonne !");
        } else {
            parler("Aïe");
        }

        //Invariant
        assert (force >= 0) : "Invariant : la force du Romain doit toujours rester positive.";
    }

}