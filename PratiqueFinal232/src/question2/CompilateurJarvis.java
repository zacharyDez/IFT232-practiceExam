package question2;

public class CompilateurJarvis {

	void compile(String prog, JournalErreurs journal) {

		String messages[] = { "misaligned ; ", "undefined reference: x", "lol",
				"trolling", "j/k" };
		int numErrors = (int) (Math.random() * 10);

		for (int i = 0; i < numErrors; i++) {
			CompilerError error;
			int type = (int) (Math.random() * 3);
			int msgPos = (int) (Math.random() * 5);
			error = new CompilerError(type, messages[msgPos]);

			journal.ajouter(error);
		}
	}
}
