package ezCommon;

import java.io.Serializable;
import java.util.ArrayList;
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

	public Task (String allParams){
			//Tokenizer goes here; 
	}

	@Override
	public ArrayList<String> getStrings() {
		//To change body of generated methods, choose Tools | Templates.
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void create(String s) {
		//To change body of generated methods, choose Tools | Templates.
		throw new UnsupportedOperationException("Not supported yet.");
	}

}