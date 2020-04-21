package question1;

import static question1.Langue.getLangue;

public abstract class TrioLingo {

	protected Langue langueComprise;
	protected Langue languePourApprendre;

	protected abstract CompagnonPub createCompagnonPub();

	protected abstract int connexion(InterfaceUsager ui);

	protected abstract Lecon prochaineLecon(InterfaceUsager ui);

	protected abstract void sauvegarder(int score);

	protected TrioLingo(int compris, int apprend) {
		langueComprise = getLangue(compris);
		languePourApprendre = getLangue(apprend);
	}

	public void executer() {

		int score = 0;
		InterfaceUsager ui = new InterfaceBidon();
		CompagnonPub pub = createCompagnonPub();

		messageIntro(ui);

		score = connexion(ui);

		while (!ui.estTermine()) {

			Lecon lec = prochaineLecon(ui);
			ui.afficher(lec.getTitre());
			score += lec.effectuer();
			ui.afficher(""+score);
			ui.afficher(pub.suggestion());
		}

		sauvegarder(score);
	}

	private void messageIntro(InterfaceUsager ui) {
		langueComprise.msgIntro();
	}

}
