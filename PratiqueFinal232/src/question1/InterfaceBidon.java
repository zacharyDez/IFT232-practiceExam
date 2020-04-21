package question1;

import java.util.Scanner;

public class InterfaceBidon implements InterfaceUsager {

	private Scanner scan = new Scanner(System.in);

	public String lire() {
		return scan.nextLine();
	}	
	
	public void afficher(String msg) {
		System.out.println(msg);

	}
	
	public boolean estTermine() {
		return scan.nextLine().equals("bye");
	}

}
