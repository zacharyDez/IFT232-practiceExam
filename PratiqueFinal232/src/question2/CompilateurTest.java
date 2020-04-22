package question2;


public class CompilateurTest {
	
	public static void main(String[] args) {

		String programme;
		
		programme = "";

		JournalErreurs journal = new JournalErreurs();
		JournalCrash journalCrash = new JournalCrash();
		JournalGrammaire journalGrammaire = new JournalGrammaire();
		JournalSyntaxe journalSyntaxe = new JournalSyntaxe();

		CompilateurJarvis compilateurJarvis = new CompilateurJarvis();
		compilateurJarvis.attach(journal);
		compilateurJarvis.attachVeto(journalCrash);
		compilateurJarvis.attach(journalGrammaire);
		compilateurJarvis.attach(journalSyntaxe);

		compilateurJarvis.compile(programme);

		journal.afficherJournal();
		//journalCrash.afficherJournal();
		//journalGrammaire.afficherJournal();
		//journalSyntaxe.afficherJournal();

	}
}
