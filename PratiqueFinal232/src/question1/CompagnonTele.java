package question1;

public class CompagnonTele implements CompagnonPub {
	
	public String suggestion() {

		return NetFlix.getInstance().getSuggestion();
	}
}
