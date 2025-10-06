package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Gaulois obelix  = new Gaulois("Ob�lix", 16);

        asterix.parler("Bonjour Ob�lix.");
        obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?)");
        asterix.parler("Oui tr�s bonne id�e.");

        Romain minus = new Romain("Minus", 6);
        System.out.println("Dans la for�t " + asterix + " et " + obelix
                + " tombent nez � nez sur le romain " + minus.getNom() + ".");
        asterix.frapper(minus);
        asterix.frapper(minus);
        asterix.frapper(minus);

        Romain brutus = new Romain("Brutus", 14);
        personnages.Druide panoramix = new personnages.Druide("Panoramix", 2);
        personnages.Chaudron chaudron = new personnages.Chaudron();

        panoramix.fabriquerPotion(4, 3);
        panoramix.remplirChaudron(chaudron);
        panoramix.boosterGaulois(obelix);   // refuse
        panoramix.boosterGaulois(asterix);  // donne potion

        asterix.frapper(brutus);
        asterix.frapper(brutus);
        asterix.frapper(brutus);
    }
}
