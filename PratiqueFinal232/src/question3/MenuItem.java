package question3;

public class MenuItem {
	
	
	private String nomItem;
	
	public MenuItem (String nom)
	{
		nomItem = nom;
	}
	
	public boolean match(String s)
	{
		return (s.compareTo(nomItem)==0);
	}

	public void activate()
	{
		System.out.println(nomItem+" activé");
		
	}
}
