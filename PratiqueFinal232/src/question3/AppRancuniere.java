package question3;

import java.util.ArrayList;

public class AppRancuniere implements Application {

	ArrayList<String> insultes;

	public AppRancuniere() {
		insultes = new ArrayList<String>();
	}

	public void insulte(String contenu) {
		insultes.add(contenu);
	}

	public void flatterie(String contenu) {
		System.out.println("La flatterie ne vous m�nera nulle part.");
	}

	public void supplication(String contenu) {
		System.out.println("Vos supplications tombent dans l'oreille d'un sourd.");
	}

	public void appreciation() {
		System.out.println("Vous m'avez insult� " + insultes.size() + "fois.");
	}
}
