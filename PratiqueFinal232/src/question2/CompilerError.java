package question2;

public class CompilerError {

	public static final int TYPE_SYNTAXE = 0;
	public static final int TYPE_GRAMMAIRE = 1;
	public static final int TYPE_CRASH = 2;

	public static final String types[] = { "Syntax error ",
			"Grammatical error ", "Unknown error" };

	private int type;
	private String message;

	public CompilerError(int t, String msg) {
		type = t;
		message = msg;
	}

	public String getMessage() {
		return types[type] + ":" + message;
	}

}
