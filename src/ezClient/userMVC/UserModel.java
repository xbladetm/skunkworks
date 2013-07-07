package ezClient.userMVC;

import ezClient.IClientObserver;
import ezClient.IClientSubject;
import ezCommon.Answer;
import ezCommon.IData;
import ezCommon.Task;
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
    ArrayList<IData> myTasks;

    public UserModel(User usr) {
        System.out.println("USER MODEL CREATED");

        user = usr;
        observers = new ArrayList<>();

        System.out.println("USER MODEL: getting tasks from DB...");
        tasks = getTasksFromDb();
        myTasks = getMYTasksFromDb();


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
        a = a.sendQuery(new Query("SELECT * FROM tasks WHERE STATUS ='NOTSTARTED';", "task"));

        return a.getObjects();
    }

    private ArrayList<IData> getMYTasksFromDb() {
        System.out.println("USER MODEl: getting tasks");
        Answer a = new Answer();
        String uid = user.getUserID();
        a = a.sendQuery(new Query("SELECT * FROM tasks WHERE USER ='" + uid + "' AND STATUS = 'INPROGRESS' ;", "task"));

        return a.getObjects();
    }

    public String getUserID() {
        return user.getUserID();
    }

    void updateTask(Task t) {
        Query q = new Query("UPDATE `tasks` SET "
                + "DESCRIPTION='" + t.getDescription()
                + "', PRIORITY='" + t.getPriority()
                + "', USER='" + t.getUserID()
                + "', ADDED='" + t.getAddedDate()
                + "', COMPLETED='" + t.getDoneDate()
                + "', STATUS='" + t.getStatus()
                + "', `SCRUM UNITS`='" + t.getScrumUnits()
                + "' WHERE TASKID= '" + t.getTaskID() + "';", "modify");
        Answer a = new Answer();
        a = a.sendQuery(q);
    }
}
