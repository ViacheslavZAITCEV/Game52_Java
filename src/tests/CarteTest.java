package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import test_technique.Carte;


public class CarteTest {
	
	
	@Test
	public void toStringTest() {
		Carte carte1 = new Carte("6", "pique", 5);
		assertEquals("6 de pique", carte1.toString());
		
	}
	
	@Test
	public void comparaisonCartesTest() {
		Carte carte1 = new Carte("6", "pique", 5);
		Carte carte2 = new Carte("6", "coeur", 5);
		Carte carte3 = new Carte("Roi", "coeur", 12);
		assertEquals(1, Carte.comparaisonCartes(carte3, carte1));
		assertEquals(-1, Carte.comparaisonCartes(carte2, carte3));
		assertEquals(0, Carte.comparaisonCartes(carte2, carte1));
	}

}
