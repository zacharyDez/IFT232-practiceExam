package question2;


public class CompilateurTest {
	
	public static void main(String[] args) {

		String programme;
		
		programme = "";

		JournalErreurs journal = new JournalErreurs();
		
		new CompilateurJarvis().compile(programme, journal);
		
		journal.afficherJournal();
	}
}
