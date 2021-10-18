package test_technique;

import java.util.ArrayList;

public class Pli {
	
	public Carte[] cartes;
	public ArrayList<Integer> vanqueurs;
	
	public Pli (Joueur[] joueurs){
		Carte[] cartes = setPli(joueurs);
		if (cartes.length < 2) {
			this.vanqueurs = new ArrayList<Integer>();			
		}else {
			this.vanqueurs = setVainqueurs(cartes);	
		}
		this.cartes = cartes;
		
	}
	
	

	private Carte[] setPli(Joueur[] joueurs) {
		Carte[] pli = new Carte[joueurs.length];
		for (int i=0; i<joueurs.length; i++) {
			pli[i] = joueurs[i].getOneCard();
		}
		return pli;
	}
	
	
	
	
	private ArrayList<Integer> setVainqueurs(Carte[] cartes) {
		ArrayList<Integer> vainqueurs = new ArrayList<Integer>();
		int max = 0;
		vainqueurs.add(max);
		for (int i=1; i < cartes.length; i++) {
			int compare = Carte.comparaisonCartes(cartes[max], cartes[i]);
			if (compare < 0) {
				max = i;
				vainqueurs = new ArrayList<Integer>();
				vainqueurs.add(max);
			} else {
				if (compare == 0) {
					vainqueurs.add(i);
				}
			}
		}
		return vainqueurs; 
	}
	
	

	
	
	public ArrayList<Carte> getArrayList(){
		ArrayList<Carte> res = new ArrayList<Carte>();
		for (int i=0; i<this.cartes.length; i++) {
			res.add(this.cartes[i]);
		}
		return res;
	}
	
	

	
	
	
	public String typePli() {
		String res ="";
		for (int i=0; i<this.cartes.length; i++) {
			res = res + this.cartes[i].toString() + ", ";
		}
		return res;
	}
}
