package ezCommon;

import java.io.*;
import java.util.*;
import java.util.Date;

public class Task implements IData, Serializable {

    private int taskID;
    private String description;
    private Priority priority;
    private int userID;
    private Date added;
    private Date completed;
    private Status status;
    private int scrumUnits;

    public Task() {
    }

    public Task(int tid, String desc, Priority p, int uid, Date added, Date comp, Status s, int scu) {
        taskID = tid;
        description = desc;
        priority = p;
        userID = uid;
        this.added = added;
        completed = comp;
        status = s;
        scrumUnits = scu;
    }

    // Getters
    public String getTaskID() {
        return "" + taskID;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return "" + priority;
    }

    public String getUserID() {
        return "" + userID;

    }

    public String getDoneDate() {
        if (completed == null) {
            return "null";
        }
        java.sql.Date d = new java.sql.Date(completed.getTime());
        return d.toString();

    }

    public String getAddedDate() {
        java.sql.Date d = new java.sql.Date(added.getTime());
        return d.toString();

    }

    public String getScrumUnits() {
        return "" + scrumUnits;
    }
    // Setters

    public void setDescription(String s) {
        description = s;
    }

    public void setPriority(String p) {
        priority = Priority.valueOf(p);
    }

    public void setUserId(int uid) {
        userID = uid;
    }

    public void setAdded(String a) {
        added = parseDate(a);
    }

    public void setCompleted(String c) {
        completed = parseDate(c);
    }

    public void setStatus(String s) {
        status = Status.valueOf(s);
    }

    public void setScrumUnits(String u) {
        scrumUnits = Integer.parseInt(u);
    }

    //Interface and private functions
    @Override
    public String getString() {
        String s = new String();
        s += ("" + taskID);
        s += ("|" + description);
        s += ("| " + priority);
        s += ("| " + userID);
        s += ("| " + added);
        s += ("| " + completed);
        s += ("| " + status);
        s += ("| " + scrumUnits);

        return s;
    }

    @Override
    public void create(String s) {
        StringTokenizer tokens = new StringTokenizer(s, "|");
        taskID = Integer.parseInt(tokens.nextToken());
        description = tokens.nextToken().trim();
        priority = Priority.valueOf(tokens.nextToken().trim());
        userID = Integer.parseInt(tokens.nextToken().trim());
        added = parseDate(tokens.nextToken());
        completed = parseDate(tokens.nextToken());
        status = Status.valueOf(tokens.nextToken().trim());
        scrumUnits = Integer.parseInt(tokens.nextToken().trim());

    }

    private Date parseDate(String date) {
        date = date.trim();
        if (date.equals("null")) {
            return null;
        } else {
            StringTokenizer tokens = new StringTokenizer(date, "-");
            int y = Integer.parseInt(tokens.nextToken().trim()) - 1900;
            int m = Integer.parseInt(tokens.nextToken().trim());
            int d = Integer.parseInt(tokens.nextToken().trim());
            return new Date(y, m, d);
        }
    }
}
