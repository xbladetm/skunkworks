package ezBoard;

import java.util.*;
import ezCommon.*;

/**
 *
 * @authors Andrei, Andrés
 * 
 */

public class Model implements IBoardSubject {
	
	List<IBoardObserver> counterObservers = new ArrayList<>();
	
	List<Task> colToDo = new ArrayList<>();
	List<Task> colInProgress = new ArrayList<>();
	List<Task> colDone = new ArrayList<>();

	public Model() {
		System.out.println("Model()");
		this.colToDo = null;
		this.colInProgress = null;
		this.colDone = null;
	}
	
	public int getNumToDo() {
		return this.colToDo.size();
	}
	
	public int getNumInProgress() {
		return this.colInProgress.size();
	}
	
	public int getNumDone() {
		return this.colDone.size();
	}
	
	public void addTask(Task t) {
		Status s = t.getStatus();
		boolean update = false;
		
		switch (s) {
			case NOTSTARTED:
				if (!this.colToDo.contains(t)) {
					this.colToDo.add(t);
					update = true;
				}
				break;
			case INPROGRESS:
				if (!this.colInProgress.contains(t)) {
					this.colInProgress.add(t);
					update = true;
				}
				break;
			case DONE:
				if (!this.colDone.contains(t)) {
					this.colDone.add(t);
					update = true;
				}
				break;
		}
		
		// Only will notify the observer if it has
		// added a task that did not exists
		if (update) notifyObservers();
	}
	
	
	@Override
	public void registerObserver(IBoardObserver o) {
		counterObservers.add(o);
	}

	@Override
	public void removeObserver(IBoardObserver o) {
		counterObservers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (IBoardObserver o: counterObservers)
			o.updateBoard();
	}
	
}
