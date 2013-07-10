/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient.userMVC;

import ezCommon.IData;
import ezCommon.Status;
import ezCommon.Task;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
    //Models and listenres

    ListModel getAvailableListModel() {
        DefaultListModel model = new DefaultListModel();
        for (IData elem : myModel.tasks) {
            Task t = (Task) elem;
            model.addElement(t.getDescription());
        }
        return model;

    }

    ListModel getMyTaskListModel() {
        DefaultListModel model = new DefaultListModel();
        for (IData elem : myModel.myTasks) {
            Task t = (Task) elem;
            model.addElement(t.getDescription());
        }
        return model;
    }

    ListSelectionListener getMyTaskListSelectionListener() {
        return new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (myView.myTaskList.getSelectedIndex() != -1 && !myModel.myTasks.isEmpty()) {
                    myView.completeTaskBtn.setEnabled(true);
                    Task t = (Task) myModel.myTasks.get(myView.myTaskList.getSelectedIndex());
                    myView.myTaskDescription.setText(t.getDescription());
                } else {
                    myView.completeTaskBtn.setEnabled(false);
                }
            }
        };
    }

    ListSelectionListener getAvailableListSelectionListener() {
        return new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (myView.availableList.getSelectedIndex() != -1 && !myModel.tasks.isEmpty()) {
                    myView.assignTaskBtn.setEnabled(true);
                    Task t = (Task) myModel.tasks.get(myView.availableList.getSelectedIndex());
                    myView.taskDateAdded.setText(t.getAddedDate());
                    myView.taskDescription.setText(t.getDescription());
                    myView.taskScrumUnits.setText(t.getScrumUnits());
                    myView.taskPriority.setText(t.getPriority());
                } else {
                    myView.assignTaskBtn.setEnabled(false);
                }
            }
        };
    }

    ActionListener getAssignTaskBtnActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pos = myView.availableList.getSelectedIndex();
                Task t = (Task) myModel.tasks.get(pos);
                t.setUserId(Integer.parseInt(myModel.getUserID()));
                t.setStatus("INPROGRESS");
                myModel.updateTask(t);
                myModel.tasks.remove(pos);
                myModel.myTasks.add(t);
                myView.availableList.setModel(getAvailableListModel());
                myView.myTaskList.setModel(getMyTaskListModel());
            }
        };
    }

    ActionListener getCompleteTaskBtnActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pos = myView.myTaskList.getSelectedIndex();
                Task t = (Task) myModel.myTasks.get(pos);
                t.setStatus("DONE");
                String today = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
                System.out.println("this is my date " + today);
                t.setCompleted(today);
                myModel.updateTask(t);
                myModel.myTasks.remove(pos);
                myView.myTaskList.setModel(getMyTaskListModel());
            }
        };
    }
}
