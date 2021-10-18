package test_technique;

public class NatSystem {

	public static void main(String[] args) {
		String[] joueurs = {"John","Mary","Robert","Mickael"};
		Game52 game = new Game52(joueurs);
		
		boolean distrbutionAllCards = game.distrbutionAllCards();
		if(distrbutionAllCards) {
			System.out.println();
			System.out.println("********************");
		
			for (int i=0; i<13; i++) {
				System.out.println(i+1 + " tour du jeu");
				game.unTour();
			}
			System.out.println("********************");
			System.out.println("Après 13 tours les joueurs ont :");
			
			game.typeLesNombresDesCartes();
		}else {
			System.out.println("le nombre des joueurs ne correspond pas au jeu");
		}

		
		System.out.println("********************");
		System.out.println("Le jeu est terminé");
	}

}
