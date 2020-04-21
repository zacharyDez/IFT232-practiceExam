package question2;

import java.util.ArrayList;

public class JournalErreurs {

	private ArrayList<CompilerError> errors;

	public JournalErreurs() {
		errors = new ArrayList<CompilerError>();
	}

	public void ajouter(CompilerError msg) {

		errors.add(msg);
	}

	public void afficherJournal() {
		for (CompilerError err : errors) {
			System.out.println(err.getMessage());
		}
	}
}
