package question1;

import java.util.ArrayList;

/*
 * Objet bidon représentant le service de base de données pour les leçons TrioLingo
 */

public class ServiceTrioLingo {
	
	private static ServiceTrioLingo instance = new ServiceTrioLingo();
	private ServiceTrioLingo(){		
	}

	public static ServiceTrioLingo getInstance(){
		return instance;
	}
	
	private ArrayList<Lecon> makeList(String titre){
		ArrayList<Lecon> liste = new ArrayList<Lecon>();
		for(int i=0;i<10;i++){
			liste.add(new Lecon(titre+" "+i));
		}		
		return liste;
	}
	public ArrayList<Lecon> getCoursAnglais(){
		return makeList("Lesson");		
	}
	public ArrayList<Lecon> getCoursFrancais(){
		return makeList("Leçon");
	}
	public ArrayList<Lecon> getCoursEspagnol(){
		return makeList("Leccion");
	}
	public void sauvegarder(String nom, int score, int lecon){		
	}

	public int getLeconCourante(String nomUsager) {
		
		return (int) Math.random()*10;
	}

	public int getScore(String nomUsager) {
		return (int) Math.random()*1000;
	}
	
}
