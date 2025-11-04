package test_fonctionnel;

import personnages.Romain;

public class TestRomain {
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.recevoirCoup(3);
		System.out.println("=== Test d’assertion : forceCoup négative ===");
		minus.recevoirCoup(-5);
		System.out.println("Si tu vois ce message, les assertions ne sont pas activées !");
	}
}
