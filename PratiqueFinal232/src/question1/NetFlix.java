package question1;

/*
 * Implémentation complète de NetFlix.
 */
public class NetFlix {

	public static NetFlix instance = new NetFlix();

	private NetFlix() {
	}

	public static NetFlix getInstance() {
		return instance;
	}
	
	public String getSuggestion(){
		return "The Walking Thrones";
	}
}
