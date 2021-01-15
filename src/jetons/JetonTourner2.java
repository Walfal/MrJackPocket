package jetons;

import java.util.Scanner;

import Autres.Detectives;
import Autres.District;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class JetonTourner2 extends Jetons {
    Scanner scanner = new Scanner(System.in);
    String nom;
	public static Image im = new Image("file:images/actions/Jeton4-Face2.png", 50, 50, false, false);
	public static ImageView imView = new ImageView(im);
    //private static HelloApp interfaceG = new HelloApp();    

    public JetonTourner2() {
    }

    public JetonTourner2(String nom) {
        this.nom = nom;
    }
    
    @Override
    public void action(Detectives[] listeDetectives, District[] board, int jActuel) {
        //HelloApp.idEnCours = "";
    	System.out.println("Entrez l'abscisse puis l'ordonnée de la tuile que vous voulez tourner:");
        /*if (scanner.nextLine().equals("")) {
        	while(!HelloApp.idEnCours.substring(0, 1).equals("Q")) {
        		//Thread.sleep((long) 1);
        	}
        	board[Integer.parseInt(HelloApp.idEnCours.substring(1, 2))].setMur();
        	System.out.println("La tuile " + Integer.parseInt(HelloApp.idEnCours.substring(1, 2)) + " a tourné");
        } else {*/
        int abscisse = scanner.nextInt() - 1;
        int ordonnee = scanner.nextInt() - 1;
        int coordonnee = 3 * abscisse + ordonnee;
        System.out.println("Appuyez sur <entrer> puis tapper 'stop' quand la disposition vous convient");
        scanner.nextLine();
        do {
            board[coordonnee].setMur();
            //interfaceG.printBoardInterface();
            //TableauTuiles.printBoardConsole(board);
        } while (!scanner.nextLine().equals("stop"));
        //}
    }
    
    @Override
    public String getNom() {
        return nom;
    }
    
	public ImageView getImView() {
		return imView;
	}
}
