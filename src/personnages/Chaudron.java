package personnages;

public class Chaudron {
    private int quantitePotion;
    private int force;

    public Chaudron() {
        this.quantitePotion = 0;
        this.force = 0;
    }

    public void remplir(int quantite, int forcePotion) {
        this.quantitePotion = quantite;
        this.force = forcePotion;
    }

    public boolean resterPotion() {
        return quantitePotion > 0;
    }

    public void retirerDose() {
        if (quantitePotion > 0) quantitePotion--;
    }
}
