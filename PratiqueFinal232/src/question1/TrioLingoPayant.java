package question1;

import java.util.ArrayList;

public class TrioLingoPayant extends TrioLingo{
	
	private int leconCourante;
	private String nomUsager;
	
	protected TrioLingoPayant(int compris, int apprend) {
		super(compris, apprend);		
	}

	// La version gratuite ne fait pas de pub
	protected CompagnonPub createCompagnonPub() {
		return new CompagnonSilencieux();
	}

	// L'application payante va chercher le score de l'utilisateur dans 
	// une base de données de comptes et de cours (ServiceTrioLingo)
	protected int connexion(InterfaceUsager ui) {	
		langueComprise.msgConnexion();
		
		nomUsager = ui.lire();		
		
		leconCourante=ServiceTrioLingo.getInstance().getLeconCourante(nomUsager);
		
		return ServiceTrioLingo.getInstance().getScore(nomUsager);
		
	}
	
	// La version gratuite ne permet que de faire la premiere lecon
	protected Lecon prochaineLecon(InterfaceUsager ui) {
		ArrayList<Lecon> lecons=languePourApprendre.getLecons();
		return lecons.get(leconCourante++);
	}

	// Aucune sauvegarde possible dans la version gratuite.
	protected void sauvegarder(int score) {	
		ServiceTrioLingo.getInstance().sauvegarder(nomUsager,score,leconCourante);
	}
}
