/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient.adminMVC;

import ezClient.IClientObserver;
import ezClient.IClientSubject;
import ezCommon.Answer;
import ezCommon.IData;
import ezCommon.Priority;
import ezCommon.Rank;
import ezCommon.Status;
import ezCommon.Task;
import ezCommon.Team;
import ezCommon.User;
import ezDataBase.Query;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrei
 */
public class AdminModel implements IClientSubject {

    private List<IClientObserver> observers;
    private User user;
    ArrayList<IData> tasks;
    ArrayList<IData> users;

    public AdminModel(User usr) {
        System.out.println("MODEL CREATED");
        user = usr;
        observers = new ArrayList<>();
        System.out.println("MODEL: getting tasks from db");
        tasks = getTasksFromDb();
        System.out.println("MODEL: getting users from db");
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

    private ArrayList<IData> getTasksFromDb() {
        System.out.println("MODEl: getting tasks");
        Answer a = new Answer();
        a = a.sendQuery(new Query("SELECT * FROM tasks;", "task"));
        System.out.println("MODEL: getting tasks from db" + a.getObjects());
        return a.getObjects();
    }

    private ArrayList<IData> getUSersFromDb() {
        System.out.println("MODEL: getting users");
        Answer a = new Answer();
        a = a.sendQuery(new Query("SELECT * FROM users;", "user"));
        return a.getObjects();
    }

    public void addTask(Task t) {
        Query q = new Query("INSERT INTO ezkanban.tasks( DESCRIPTION, PRIORITY, USER, ADDED, COMPLETED, STATUS, `SCRUM UNITS`)"
                + " VALUES( '" + t.getDescription()
                + "', '" + t.getPriority()
                + "', '" + t.getUserID()
                + "', '" + t.getAddedDate()
                + "', '" + t.getDoneDate()
                + "', '" + t.getStatus()
                + "', '" + t.getScrumUnits()
                + "');", "modify");
        Answer a = new Answer();
        System.out.println(q.getString());
        a = a.sendQuery(q);
        notifyObservers();
    }

    public void removeTask(Task t) {
        System.out.println("MODEL: removing task" + t.getDescription());
        Query q = new Query("DELETE FROM tasks WHERE TASKID ='" + t.getTaskID() + "';", "modify");
        Answer a = new Answer();
        a = a.sendQuery(q);
        notifyObservers();
    }

    public void updateTask(Task t) {
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
        notifyObservers();
    }

    public void addUser(User u) {
        Query q = new Query("INSERT INTO ezkanban.users( NAME, SURNAME, RANK, TEAM, SCRUMUNITS, USERNAME, PASSWORD)"
                + " VALUES( '" + u.getName()
                + "', '" + u.getSurname()
                + "', '" + u.getRank()
                + "', '" + u.getTeam()
                + "', '" + u.getScrumUnits()
                + "', '" + u.getUsername()
                + "', '" + u.getPassword()
                + "');", "modify");
        Answer a = new Answer();
        System.out.println(q.getString());
        a = a.sendQuery(q);
        notifyObservers();
    }

    public void removeUser(User u) {
        System.out.println("MODEL: removing USER" + u.getName());
        Query q = new Query("DELETE FROM users WHERE USERID ='" + u.getUserID() + "';", "modify");
        Answer a = new Answer();
        a = a.sendQuery(q);
        notifyObservers();
    }

    public void updateUser(User u) {
        Query q = new Query("UPDATE users SET"
                + "NAME='" + u.getName()
                + "', SURNAME= '" + u.getSurname()
                + "', RANK= '" + u.getRank()
                + "', TEAM= '" + u.getTeam()
                + "', SCRUMUNITS= '" + u.getScrumUnits()
                + "', USERNAME= '" + u.getUsername()
                + "', PASSWORD= '" + u.getPassword()
                + "');", "modify");

        Answer a = new Answer();
        System.out.println(q.getString());
        a = a.sendQuery(q);
        notifyObservers();
    }
    //TASKS TAB MODEL FUNCTIONS
    //USER TAB MODEL FUNCTIONS

    Rank[] getRanks() {
        return Rank.values();
    }

    Team[] getTeams() {
        return Team.values();
    }

    Priority[] getPriority() {
        return Priority.values();
    }

    Status[] getStatus() {
        return Status.values();
    }

    public static void main(String params[]) {

        AdminModel m = new AdminModel(null);
        Task t = (Task) m.tasks.get(4);
        t.setDescription("ESTO LO HE glfasjdf");
        m.updateTask(t);

        System.out.println(t.getString());

    }
}
