package test_technique;

public class Pile {

	private Carte[] pile;
	
	public Pile(String[] valeur, String[] couleur){
		this.pile = newPile(valeur, couleur);
		this.typePile();
		this.mixerPile();
	}
	
	private Carte[] newPile(String[] valeur, String[] couleur) {
		Carte[] creationPile = new Carte[valeur.length * couleur.length];
				for (int i=0; i<valeur.length; i++) {
					for (int j=0; j<couleur.length; j++) {
						creationPile[i*couleur.length + j] = new Carte(valeur[i], couleur[j], i);
//						System.out.println(" new Carte: "+ creationPile[i*couleur.length + j].toString());
					}
				}
		return creationPile;
	}
	
	
	private void typePile() {
		for (int i=0; i<this.pile.length; i++) {
			System.out.println(this.pile[i].toString());
		}
	}
	
	
	
	private void mixerPile() {
		Carte[] pileMix = new Carte[this.pile.length];
		int pileLength = this.pile.length;

		for (int i=0; i<pileLength; i++) {
			int indexRandom = (int) Math.floor( Math.random()*this.pile.length );
			pileMix[i] = this.pile[indexRandom];
			this.slicePile(indexRandom);
		}
		this.pile = pileMix;
	}
	
	private void slicePile(int indexRandom) {
		Carte[] newPile = new Carte [this.pile.length -1];
		for (int i=0; i<indexRandom; i++) {
			newPile[i] = this.pile[i];
		}
		for (int i=indexRandom+1; i<this.pile.length; i++) {
			newPile[i-1] = this.pile[i];
		}
		this.pile = newPile;
	}

	public int getPileLength() {
		return this.pile.length;
	}
	
	
	
	
	public Carte getOneCard() {
		Carte res = this.pile[0];
		this.shiftPile();
		//System.out.println(" from pile: " + res.toString());
		return res;
	}
	
	private void shiftPile() {
		Carte[] newPile = new Carte[this.pile.length-1];
		for (int i=1; i<this.pile.length; i++) {
			newPile[i-1] = this.pile[i];
		}
		this.pile = newPile;
	}
	
	public Carte[] getPile() {
		return this.pile;
	}
	
	
}
