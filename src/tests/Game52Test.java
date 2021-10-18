package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test_technique.Carte;
import test_technique.Game52;

class Game52Test {
	


	@Test
	void distrbutionAllCardsTest() {
		
		String[] joueurs = {"A","B","C","D"};
		Game52 game = new Game52(joueurs);

		assertEquals(4, game.joueurs.length);
		
		boolean distrbutionAllCards = game.distrbutionAllCards();
		assertTrue(distrbutionAllCards);
		
		assertEquals(13, game.joueurs[0].cartes.size());
		assertEquals(13, game.joueurs[1].cartes.size());
		assertEquals(13, game.joueurs[2].cartes.size());
		assertEquals(13, game.joueurs[3].cartes.size());
	}


	@Test
	void unTourTest() {
		
		String[] joueurs = {"A","B","C","D"};
		Game52 game = new Game52(joueurs);
		
		boolean distrbutionAllCards = game.distrbutionAllCards();
		
		Carte carte0 = new Carte("6", "pique", 5);
		Carte carte1 = new Carte("6", "coeur", 5);
		Carte carte2 = new Carte("Roi", "coeur", 12);
		Carte carte3 = new Carte("As", "pique", 13);
		
		game.joueurs[0].cartes.set(0, carte0);
		game.joueurs[1].cartes.set(0, carte1);
		game.joueurs[2].cartes.set(0, carte2);
		game.joueurs[3].cartes.set(0, carte3);
		
		game.unTour();
		
		assertEquals(12, game.joueurs[0].cartes.size());
		assertEquals(12, game.joueurs[1].cartes.size());
		assertEquals(12, game.joueurs[2].cartes.size());
		assertEquals(16, game.joueurs[3].cartes.size());
	}

	
}
