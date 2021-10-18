package test_technique;

public class Game52 {
	
	public Joueur[] joueurs;
	private Pile pile;

	public Game52(String[] nomJoueurs){
		Joueur[] joueurs = new Joueur[nomJoueurs.length];
		for (int i=0; i<nomJoueurs.length; i++) {
			joueurs[i] = new Joueur(nomJoueurs[i]);
		}
		this.joueurs = joueurs;
		
		String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi", "As"};
		String[] couleurs = {"trèfle", "pique", "coeur", "carreau"};
		Pile pile = new Pile(valeurs, couleurs);
		this.pile = pile;
	}
	
	
	
	
	
	public boolean distrbutionAllCards() {
		
		int cartes = this.pile.getPileLength();
		if (cartes % this.joueurs.length != 0) return false;
		
		int j=0;
		while (cartes > 0 ) {
			this.joueurs[j].addCard(pile.getOneCard());
			j++;
			if (j >= joueurs.length) j=0;
			cartes--;
		}
		return true;
	}
	
	
	


	private String typeVainqueur(Pli pli) {
		String res = "";
		if (pli.vanqueurs.size() > 1) {
			res += "Vainqueurs:";
			for (int i=0; i<pli.vanqueurs.size(); i++) {
				res +=  " " + this.joueurs[ pli.vanqueurs.get(i) ].name;
			}
		}else {
			res += "Vainqueur: " + this.joueurs[ pli.vanqueurs.get(0) ].name;
		}
		return res;
	}


	
	
	private int getVainqueur(Pli pli) {
		int vainqueur;
		if (pli.vanqueurs.size() > 1) {
			vainqueur = pli.vanqueurs.get((int) Math.random()*pli.vanqueurs.size());
		}else {
			vainqueur = pli.vanqueurs.get(0);
		}
		return vainqueur;
	}

	
	
	public void unTour(){
		Pli pli = new Pli(this.joueurs);
		
		System.out.println("");	
		System.out.println("Nouveau pli:");
		for (int i=0; i<joueurs.length; i++) {
			System.out.println(joueurs[i].name + " met " + pli.cartes[i]);
		}
		
		System.out.println(this.typeVainqueur(pli));
		
		int vainqueur = this.getVainqueur(pli);
		
		this.joueurs[vainqueur].addCards(pli);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
		System.out.println();
	}





	public void typeLesNombresDesCartes() {
		for (int i=0; i<this.joueurs.length; i++) {
			System.out.println(this.joueurs[i].name + " a " + this.joueurs[i].cartes.size() + " cartes");
		}		
	}


	


	
	
}
