package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test_technique.Carte;
import test_technique.Joueur;
import test_technique.Pli;

class JoueurTest {

	@Test
	void addCardTest() {
		Joueur joueur1 = new Joueur("joueur1");
		Carte carte1 = new Carte("6", "pique", 5);
		Carte carte2 = new Carte("6", "coeur", 5);
		Carte carte3 = new Carte("Roi", "coeur", 12);
		joueur1.addCard(carte1);
		joueur1.addCard(carte2);
		joueur1.addCard(carte3);
		assertEquals(joueur1.cartes.get(0), carte1);
		assertEquals(joueur1.cartes.get(1), carte2);
		assertEquals(joueur1.cartes.get(2), carte3);
	}
	

	@Test
	void getOneCardTest() {
		Joueur joueur1 = new Joueur("joueur1");
		Carte carte1 = new Carte("6", "pique", 5);
		Carte carte2 = new Carte("6", "coeur", 5);
		Carte carte3 = new Carte("Roi", "coeur", 12);
		joueur1.addCard(carte1);
		joueur1.addCard(carte2);
		joueur1.addCard(carte3);
		assertEquals(joueur1.getOneCard(), carte1);
		assertEquals(joueur1.getOneCard(), carte2);
		assertEquals(joueur1.getOneCard(), carte3);
	}


	@Test
	void addCardsTest() {
		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		Joueur joueur3 = new Joueur("joueur3");
		Carte carte1 = new Carte("6", "pique", 5);
		Carte carte2 = new Carte("6", "coeur", 5);
		Carte carte3 = new Carte("Roi", "coeur", 12);
		joueur1.addCard(carte1);
		joueur2.addCard(carte2);
		joueur3.addCard(carte3);
		Joueur[] joueurs = {joueur1, joueur2, joueur3};
		Pli pli = new Pli(joueurs);
		joueur3.addCards(pli);
		assertEquals(joueur3.cartes.get(0), carte1);
		assertEquals(joueur3.cartes.get(1), carte2);
		assertEquals(joueur3.cartes.get(2), carte3);
	}

}
