package ezBoard;

public interface IBoardSubject {
	public void registerObserver(IBoardObserver o);
	public void removeObserver(IBoardObserver o);
	public void notifyObservers();	
}
