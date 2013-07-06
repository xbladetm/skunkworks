package ezClient.userMVC;

import ezClient.IClientObserver;
import ezClient.IClientSubject;
import ezCommon.Answer;
import ezCommon.IData;
import ezCommon.User;
import ezDataBase.Query;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrei
 */
public class UserModel implements IClientSubject {

    private User user;
	private List<IClientObserver> observers;
	
	ArrayList<IData> tasks;
    ArrayList<IData> users;

    public UserModel(User usr) {
		System.out.println("USER MODEL CREATED");
		
        user = usr;
		observers = new ArrayList<>();
		
		System.out.println("USER MODEL: getting tasks from DB...");
		tasks = getTasksFromDb();
		
		System.out.println("USER MODEL: getting users from DB...");
		users = getUSersFromDb();
    }

	
	@Override
	public void registerObserver(IClientObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(IClientObserver o) {
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (IClientObserver o : observers) {
			o.updateClient();
		}

	}
	
	
	// DB Connection methods
	
	private ArrayList<IData> getTasksFromDb() {
		System.out.println("USER MODEl: getting tasks");
		Answer a = new Answer();
		a = a.sendQuery(new Query("SELECT * FROM tasks;", "task"));
		//System.out.println("USER MODEL: getting tasks from db" + a.getObjects());
		return a.getObjects();
	}

	private ArrayList<IData> getUSersFromDb() {
		System.out.println("USER MODEL: getting users");
		Answer a = new Answer();
		//System.out.println("USER MODEL: getting users from db" + a.getObjects());
		a = a.sendQuery(new Query("SELECT * FROM users;", "user"));
		return a.getObjects();
	}
}
