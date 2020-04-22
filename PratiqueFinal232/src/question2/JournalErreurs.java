package question2;

import java.util.ArrayList;

public class JournalErreurs implements Observer {

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

	protected CompilerError cast(Object o){
		if(o instanceof CompilerError){
			return (CompilerError) o;
		} else
			return null;
	}

	@Override
	public void update(Object o) {
		ajouter(cast(o));
	}

	@Override
	public boolean checkVeto(Object o) {
		return true;
	}
}
