package jetons;

import Autres.Detectives;
import Autres.District;

public abstract class Jetons {

	abstract public String getNom();

	abstract public void action(Detectives[] listeDetectives, District[][] board, String joueurActuel);
}
