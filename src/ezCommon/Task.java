package ezCommon;

import java.io.*;
import java.util.*;
import java.sql.Date;


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

	@Override
	public ArrayList<String> getStrings() {
		ArrayList<String> listAtr = new ArrayList<>();
		listAtr.add("" + this.taskID);
		listAtr.add(this.description);
		listAtr.add("" + this.priority);
		listAtr.add("" + this.added);
		listAtr.add("" + this.completed);
		listAtr.add("" + this.status);
		listAtr.add("" + this.scrumUnits);
		
		return listAtr;
		
	}

	@Override
	public void create(String s) {
		StringTokenizer tokens = new StringTokenizer(s);
		this.taskID = Integer.parseInt(tokens.nextToken());
		this.description = tokens.nextToken();	
		// this.priority = ;
		this.userID = Integer.parseInt(tokens.nextToken());
		//this.added = ;
		// this.completed = ;
		// this.status = ;
		this.scrumUnits = Integer.parseInt(tokens.nextToken());
		
	}
}