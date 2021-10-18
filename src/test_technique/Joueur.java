package test_technique;

import java.util.ArrayList;

public class Joueur {
	
	String name;
	public ArrayList<Carte> cartes;

	public Joueur(String name){
		this.name = name;
		this.cartes = new ArrayList<Carte>();
	}
	
	
	
	public Carte getOneCard() {
		Carte res = this.cartes.get(0);
		this.cartes.remove(0);
		return res;
	}

	public void addCard(Carte card) {
		this.cartes.add(card);
	}
	
	public void addCards(Pli pli) {
		this.cartes.addAll( pli.getArrayList() );		
		System.out.println(this.name + " prends le pli: " + pli.typePli());
	}
	
	
}


