package question3;



public abstract class Command  {

	protected abstract void execute();	
	protected Application app;	
	
	public Command(Application a){
		
		app=a;
	}
}
