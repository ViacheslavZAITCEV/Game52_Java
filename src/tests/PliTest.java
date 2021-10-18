package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import test_technique.Carte;
import test_technique.Joueur;
import test_technique.Pli;

class PliTest {

	@Test
	void pliTest() {
		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		Joueur joueur3 = new Joueur("joueur3");
		Joueur joueur4 = new Joueur("joueur4");
		Carte carte1 = new Carte("6", "pique", 5);
		Carte carte2 = new Carte("6", "coeur", 5);
		Carte carte3 = new Carte("Roi", "coeur", 12);
		Carte carte4 = new Carte("As", "coeur", 13);
		Carte[] cartes = {carte1, carte2, carte3, carte4};
		joueur1.addCard(carte1);
		joueur2.addCard(carte2);
		joueur3.addCard(carte3);
		joueur4.addCard(carte4);
		Joueur[] joueurs = {joueur1, joueur2, joueur3, joueur4};
		Pli pli = new Pli(joueurs);
		assertSame(cartes[0], pli.cartes[0]);
		assertSame(cartes[1], pli.cartes[1]);
		assertSame(cartes[2], pli.cartes[2]);
		assertSame(cartes[3], pli.cartes[3]);
		assertEquals(1, pli.vanqueurs.size());
		assertEquals(3, pli.vanqueurs.get(0));
	}


	@Test
	void pliVainqueursTwoEqualsTest() {
		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		Joueur joueur3 = new Joueur("joueur3");
		Joueur joueur4 = new Joueur("joueur4");
		Carte carte1 = new Carte("6", "pique", 5);
		Carte carte2 = new Carte("6", "coeur", 5);
		Carte carte3 = new Carte("2", "coeur", 0);
		Carte carte4 = new Carte("3", "coeur", 1);
		Carte[] cartes = {carte1, carte2, carte3, carte4};
		joueur1.addCard(carte1);
		joueur2.addCard(carte2);
		joueur3.addCard(carte3);
		joueur4.addCard(carte4);
		Joueur[] joueurs = {joueur1, joueur2, joueur3, joueur4};
		Pli pli = new Pli(joueurs);
		assertSame(cartes[0], pli.cartes[0]);
		assertSame(cartes[1], pli.cartes[1]);
		assertSame(cartes[2], pli.cartes[2]);
		assertSame(cartes[3], pli.cartes[3]);
		assertEquals(2, pli.vanqueurs.size());
		assertEquals(0, pli.vanqueurs.get(0));
		assertEquals(1, pli.vanqueurs.get(1));
	}


	@Test
	void pliVainqueursFourEqualsTest() {
		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		Joueur joueur3 = new Joueur("joueur3");
		Joueur joueur4 = new Joueur("joueur4");
		Carte carte1 = new Carte("6", "pique", 5);
		Carte carte2 = new Carte("6", "trèfle", 5);
		Carte carte3 = new Carte("6", "coeur", 5);
		Carte carte4 = new Carte("6", "carreau", 5);
		Carte[] cartes = {carte1, carte2, carte3, carte4};
		joueur1.addCard(carte1);
		joueur2.addCard(carte2);
		joueur3.addCard(carte3);
		joueur4.addCard(carte4);
		Joueur[] joueurs = {joueur1, joueur2, joueur3, joueur4};
		Pli pli = new Pli(joueurs);
		assertSame(cartes[0], pli.cartes[0]);
		assertSame(cartes[1], pli.cartes[1]);
		assertSame(cartes[2], pli.cartes[2]);
		assertSame(cartes[3], pli.cartes[3]);
		assertEquals(4, pli.vanqueurs.size());
		assertEquals(0, pli.vanqueurs.get(0));
		assertEquals(1, pli.vanqueurs.get(1));
		assertEquals(2, pli.vanqueurs.get(2));
		assertEquals(3, pli.vanqueurs.get(3));
	}

}
