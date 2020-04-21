package question3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MenuApplication {

	ArrayList<MenuItem> items;
	BufferedReader reader;

	public static void main(String[] args) {

		Application app = new AppRancuniere();
		MenuApplication menu = new MenuApplication(app);

		menu.demarrer();
	}

	private void demarrer() {
		
		System.out.println(ObtenirMenu());
		String choix = readString();

		while (choix.compareTo("Quitter") != 0) {

			
			for (MenuItem i:items)
			{
				if(i.match(choix)){
					i.activate();
				}					
			}
			System.out.println(ObtenirMenu());
			choix = readString();
		}

	}

	private String readString() {
		
		String res="";
		
		try{
			res = reader.readLine();
		}
		catch(Exception e)
		{}
		
		return res;
	}

	public MenuApplication(Application app) {
		reader = new BufferedReader(new InputStreamReader(System.in));
		items = new ArrayList<MenuItem>();
		
		MenuItem insulter = new MenuItem("Insulter");
		MenuItem supplier = new MenuItem("Supplier");
		MenuItem flatter = new MenuItem("Flatter");
		MenuItem appreciation = new MenuItem("Appreciation");
		
		items.add(insulter);
		items.add(flatter);
		items.add(appreciation);
		items.add(supplier);		
	}

	public String ObtenirMenu() {
		String menu = "Les choix possibles sont:\n" + "Insulter\n" + "Supplier\n"
				+ "Flatter\n" + "Appreciation\n" + "Quitter\n";

		return menu;
	}

}
