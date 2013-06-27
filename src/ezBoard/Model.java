package ezBoard;

import java.util.*;
import ezCommon.*;
import ezDataBase.Query;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @authors Andrei, Andrés
 *
 */
public class Model implements IBoardSubject {

    private ArrayList<IBoardObserver> boardObservers;
    private ArrayList<IData> colToDo;
    private ArrayList<IData> colInProgress;
    private ArrayList<IData> colDone;
    private boolean updated;
    private Timer timer;

    public Model() {
        updated = true;
        System.out.println("Model()");
        getToDosFromDb();
        getInProgressFromDb();
        getDoneFromDb();
        boardObservers = new ArrayList<>();
        timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer's up, updating!");
                getToDosFromDb();
                getInProgressFromDb();
                getDoneFromDb();
                notifyObservers();

            }
        }, 500, 10000);

    }

    public ArrayList<IData> getToDo() {
        return colToDo;
    }

    public ArrayList<IData> getInProgress() {
        return colInProgress;
    }

    public ArrayList<IData> getDone() {
        return colDone;
    }

    @Override
    public void registerObserver(IBoardObserver o) {
        boardObservers.add(o);
    }

    @Override
    public void removeObserver(IBoardObserver o) {
        boardObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IBoardObserver o : boardObservers) {
            o.updateBoard();
        }
    }

    private void getToDosFromDb() {
        Query q = new Query("SELECT * FROM tasks WHERE status='NOTSTARTED';", "task");
        Answer a = new Answer();
        a = a.sendQuery(q);
        colToDo = a.getObjects();



    }

    private void getInProgressFromDb() {
        Query q = new Query("SELECT * FROM tasks WHERE status='INPROGRESS';", "task");
        Answer a = new Answer();
        a = a.sendQuery(q);
        colInProgress = a.getObjects();

    }

    private void getDoneFromDb() {
        Query q = new Query("SELECT * FROM tasks WHERE status='DONE';", "task");
        Answer a = new Answer();
        a = a.sendQuery(q);
        colDone = a.getObjects();

    }
}
