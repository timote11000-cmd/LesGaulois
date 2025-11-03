package test_fonctionnel;

import personnages.Gaulois;
import personnages.Village;

public class TestVillage {
    public static void main(String[] args) {
        Village village = new Village("Village des Irréductibles", 30);

        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);

        village.ajouterVillageois(asterix);
        village.ajouterVillageois(obelix);

        village.afficherVillageois();

        asterix.sePresenter();
        obelix.sePresenter();

        Gaulois doublepolémix = new Gaulois("Doublepolémix", 4);
        doublepolémix.sePresenter();

        village.trouverVillageois(3);
    }
}
