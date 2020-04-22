package question2;

public interface Observer {
    public void update(Object o);
    public boolean checkVeto(Object o);
}
