package test_fonctionnel;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;


public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Druide panoramix = new Druide("Panoramix", 2);
		
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		
		Romain minus = new Romain("Minus", 6);
		
		panoramix.fabriquerPotion(1, 3);

	    panoramix.booster(asterix);
		
		System.out.println("Dans la forêt " + asterix.getNom() + " et " + obelix.getNom() + " tombent nez à nez sur le romain " + minus.getNom() + ".");
        
        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }
	}
}