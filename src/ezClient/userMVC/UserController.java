/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient.userMVC;

import ezCommon.IData;
import ezCommon.Task;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Andrei
 */
public class UserController {
	
	private UserModel myModel;
    private UserView myView;

    public UserController() {
        System.out.println("USER CONTOLLER CREATED");
    }

    public void addModel(UserModel m) {
        System.out.println("CONTOLLER adding model");
        myModel = m;
    }
	

    public void addView(UserView v) {
		System.out.println("CONTOLLER adding view");
        myView = v;
    }

    public void runView() {
        System.out.println("CONTOLLER running view");
        myView.run();
    }
	
	// ---------- ---------- ---------- ----------
	
	ActionListener assignTaskBtnActionPerformed() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.		
	}
	
	ActionListener taskDateAddedActionPerformed() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.		
	}
	
	ActionListener taskScrumUnitsActionPerformed() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.		
	}
	
	ActionListener completeTaskBtnActionPerformed() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.		
	}
	
	ActionListener getUpdateTaskBtnListener() {
		return new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int pos = myView.myTaskList.getSelectedIndex() - 1;
				Task t = (Task) myModel.userTasks.get(pos);

				t.setStatus("DONE");
				
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				//get current date time with Date()
				Date date = new Date();
				String dateComplete = dateFormat.format(date);
				t.setCompleted(dateComplete);

				myModel.updateTask(t);
				myModel.userTasks.remove(pos);
				myModel.userTasks.add(pos, t);

				myView.myTaskList.setModel(getTaskListModel());
			}
		};
	}
	
	ListModel getTaskListModel() {
        DefaultListModel model = new DefaultListModel();
        updateTaskListModel(model);
        return model;
    }
	
	private void updateTaskListModel(DefaultListModel model) {
        model.removeAllElements();
        model.addElement("+ Add Task");
        for (IData elem : myModel.userTasks) {
            Task t = (Task) elem;
            model.addElement(t.getDescription());
        }

    }
}
