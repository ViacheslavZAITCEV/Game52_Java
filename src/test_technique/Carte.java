package test_technique;

public class Carte {
	
	private String valeur;
	private String couleur;
	private int seniority;
	
	public Carte(String valeur, String couleur, int seniority){
		this.valeur = valeur;
		this.couleur = couleur;
		this.seniority = seniority;
	}

	public String toString() {
		return this.valeur + " de " + this.couleur;
	}
	
	public static int comparaisonCartes(Carte c1, Carte c2) {
		if (c1.seniority > c2.seniority) return 1;
		if (c1.seniority < c2.seniority) return -1;
		return 0;
	}

	public String getValeur() {
		return this.valeur;
	}
	public String geCouleur() {
		return this.couleur;
	}
}
