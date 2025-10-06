package personnages;

public class Chaudron {
    private int quantitePotion;

    public Chaudron() {
        this.quantitePotion = 0;
    }

    public void remplir(int quantite) {
        this.quantitePotion = quantite;
    }

    public boolean resterPotion() {
        return quantitePotion > 0;
    }

    public void retirerDose() {
        if (quantitePotion > 0) quantitePotion--;
    }
}
