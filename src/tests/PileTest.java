package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test_technique.Carte;
import test_technique.Pile;

class PileTest {

	@Test
	void pileTest() {
		
		String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi", "As"};
		String[] couleurs = {"trèfle", "pique", "coeur", "carreau"};
		Pile pile = new Pile(valeurs, couleurs);
		
		assertEquals(52, pile.getPileLength());
		
		Carte firstCarte = pile.getPile()[0];
		Carte secondCarte = pile.getPile()[1];
		Carte thirtdCarte = pile.getPile()[2];
		boolean verificationCarte1 = firstCarte.getValeur() == "2" &&  firstCarte.getValeur() == "trèfle";
		boolean verificationCarte2 = secondCarte.getValeur() == "2" &&  secondCarte.getValeur() == "pique";
		boolean verificationCarte3 = thirtdCarte.getValeur() == "2" &&  thirtdCarte.getValeur() == "coeur";

		assertFalse(verificationCarte1 && verificationCarte2 && verificationCarte3);
	}
	
	@Test
	void cartesDansPileTest() {
		
		String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi", "As"};
		String[] couleurs = {"trèfle", "pique", "coeur", "carreau"};
		Pile pile = new Pile(valeurs, couleurs);
		
		for (int i=0; i<pile.getPileLength(); i++) {
			Carte firstCarte = pile.getPile()[i];
			
			for (int j=i+1; j<pile.getPileLength(); j++) {
				Carte nextCarte = pile.getPile()[j];
				assertNotSame(firstCarte, nextCarte);
			}
		}
	}
	
	
	@Test
	void getOneCardTest() {
		
		String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi", "As"};
		String[] couleurs = {"trèfle", "pique", "coeur", "carreau"};
		Pile pile = new Pile(valeurs, couleurs);
		
		assertEquals(52, pile.getPileLength());	
		Carte firstCarte = pile.getOneCard();
		assertEquals(51, pile.getPileLength());
		System.out.println("first: " + firstCarte.toString());

	}
	

}
