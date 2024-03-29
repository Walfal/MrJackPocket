package Autres;

public class TableauTuiles {

	static Detectives sherlock = new Detectives("Sherlock", 24);
	static Detectives watson = new Detectives("Watson", 4);
	static Detectives toby = new Detectives("Toby", 8);

	static Detectives[] listeDetectives = listeDetectives();

	static District williamGull = new District("Suspect", (int) (Math.random() * 3), "William Gull");
	static District sergentGoodley = new District("Suspect", (int) (Math.random() * 3), "Sgt Goodley");
	static District missStealthy = new District("Suspect", (int) (Math.random() * 3), "Miss Stealthy");
	static District madame = new District("Suspect", (int) (Math.random() * 3), "Madame");
	static District josephLane = new District("Suspect", (int) (Math.random() * 3), "Joseph Lane");
	static District johnSmith = new District("Suspect", (int) (Math.random() * 3), "John Smith");
	static District johnPizer = new District("Suspect", (int) (Math.random() * 3), "John Pizer");
	static District jeremyBert = new District("Suspect", (int) (Math.random() * 3), "Jeremy Bert");
	static District inspectorLestrade = new District("Suspect", (int) (Math.random() * 3), "Inspector Lestrade");

	static private District[] board = { williamGull, sergentGoodley, missStealthy, madame, josephLane, johnSmith,
			johnPizer, jeremyBert, inspectorLestrade };

	public TableauTuiles() {
	}

	public static District[] shuffleArray() {
		for (int i = board.length - 1; i > 0; i--) {
			int j = (int) (Math.random() * (i + 1));
			District temp = board[i];
			board[i] = board[j];
			board[j] = temp;
		}
		while (board[0].getMur() != 3) {
			board[0].setMur();
		}
		while (board[2].getMur() != 1) {
			board[2].setMur();
		}
		while (board[7].getMur() != 2) {
			board[7].setMur();
		}
		return board;
	}

	public static Detectives[] listeDetectives() {
		Detectives[] listeDetectives = { sherlock, watson, toby };
		return listeDetectives;
	}
}
