package question1;

import java.util.ArrayList;

public class TrioLingoGratuit extends TrioLingo {

	
	protected TrioLingoGratuit(int compris, int apprend) {
		super(compris, apprend);		
	}

	// La version gratuite fait de la pub pour les series télé
	protected CompagnonPub createCompagnonPub() {
		return new CompagnonTele();
	}

	// Aucune connexion dans l'application gratuite, le score démarre à 0
	protected int connexion(InterfaceUsager ui) {		
		return 0;
	}
	
	// La version gratuite ne permet que de faire la premiere lecon
	protected Lecon prochaineLecon(InterfaceUsager ui) {
		ArrayList<Lecon> lecons=languePourApprendre.getLecons();
		return lecons.get(0);
	}

	// Aucune sauvegarde possible dans la version gratuite.
	protected void sauvegarder(int score) {		
	}

}
