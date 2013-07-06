/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient.adminMVC;

import ezCommon.IData;
import ezCommon.Task;
import ezCommon.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Andrei
 */
public class AdminController {

    private AdminModel myModel;
    private AdminView myView;

    public AdminController() {
        System.out.println("ADMIN CONTOLLER CREATED");


    }

    public void addModel(AdminModel m) {
        System.out.println("CONTOLLER adding model");
        myModel = m;
    }

    public void addView(AdminView v) {
        System.out.println("CONTOLLER adding view");
        myView = v;
    }

    public void runView() {
        System.out.println("CONTOLLER running view");
        while (myModel.tasks == null) {
            continue;
        }
        myView.run();
    }

    //USERS TAB MODELS AND LISTENERS
    ComboBoxModel getUserRankModel() {
        return new javax.swing.DefaultComboBoxModel(myModel.getRanks());
    }

    ComboBoxModel getUserTeamModel() {
        return new javax.swing.DefaultComboBoxModel(myModel.getTeams());
    }

    DefaultListModel getUserListModel() {
        DefaultListModel model = new DefaultListModel();
        for (IData elem : myModel.users) {
            User u = (User) elem;
            model.addElement(u.getName());
        }
        return model;

    }

    ActionListener getAddUserBtnListener() {
        return null;
    }

    ActionListener getUpdateUserBtnListener() {
        return null;
    }

    ActionListener getRemoveUserBtnListener() {
        return null;
    }
    // TASKS TAB MODELS AND LISTENERS

    ListModel getTaskListModel() {
        DefaultListModel model = new DefaultListModel();
        updateModel(model);
        return model;
    }

    ComboBoxModel getTaskPriorityModel() {
        return new javax.swing.DefaultComboBoxModel(myModel.getPriority());
    }

    ComboBoxModel getTaskStausModel() {
        return new javax.swing.DefaultComboBoxModel(myModel.getStatus());
    }

    ActionListener getAddTaskBtnListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task t = new Task();
                t.setDescription(myView.taskDescription.getText().trim());
                t.setPriority(myView.taskPriority.getSelectedItem().toString().trim());
                t.setStatus(myView.taskStatus.getSelectedItem().toString().trim());
                t.setAdded(myView.taskDateAdded.getText().trim());
                t.setCompleted(myView.taskDateComplete.getText().trim());
                t.setScrumUnits("" + myView.taskScrumUnits.getValue());
                t.setUserId(1);
                myModel.addTask(t);
                myModel.tasks.add(t);
                myView.taskList.setModel(getTaskListModel());
            }
        };
    }

    ActionListener getUpdateTaskBtnListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pos = myView.taskList.getSelectedIndex() - 1;
                Task t = (Task) myModel.tasks.get(pos);
                t.setDescription(myView.taskDescription.getText().trim());
                t.setPriority(myView.taskPriority.getSelectedItem().toString().trim());
                t.setStatus(myView.taskStatus.getSelectedItem().toString().trim());
                t.setAdded(myView.taskDateAdded.getText().trim());
                t.setCompleted(myView.taskDateComplete.getText().trim());
                t.setScrumUnits("" + myView.taskScrumUnits.getValue());
                myModel.updateTask(t);
                myModel.tasks.remove(pos);
                myModel.tasks.add(pos, t);
                myView.taskList.setModel(getTaskListModel());
            }
        };
    }

    ActionListener getRemoveTaskBtnListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int del = myView.taskList.getSelectedIndex() - 1;
                myModel.removeTask((Task) myModel.tasks.get(del));
                myModel.tasks.remove(del);
                myView.taskList.setModel(getTaskListModel());

            }
        };
    }

    ListSelectionListener getListSelectionListener() {
        return new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (myView.taskList.getSelectedIndex() == 0) {
                    myView.removeTaskBtn.setEnabled(false);
                    myView.updateTaskBtn.setEnabled(false);
                    myView.addTaskBtn.setEnabled(true);
                    myView.taskDescription.setText("");
                    myView.taskDateAdded.setText("YYYY-MM-DD");
                    myView.taskDateComplete.setText("YYYY-MM-DD");
                    myView.taskScrumUnits.setValue(0);

                } else if (myView.taskList.getSelectedIndex() != -1) {
                    myView.addTaskBtn.setEnabled(false);
                    myView.removeTaskBtn.setEnabled(true);
                    myView.updateTaskBtn.setEnabled(true);
                    Task t = (Task) myModel.tasks.get(myView.taskList.getSelectedIndex() - 1);
                    myView.taskDescription.setText(t.getDescription());
                    myView.taskDateAdded.setText(t.getAddedDate());
                    myView.taskDateComplete.setText(t.getDoneDate());
                    myView.taskScrumUnits.setValue(Integer.parseInt(t.getScrumUnits()));
                    myView.taskPriority.setSelectedItem(t.getPriority());
                    myView.taskStatus.setSelectedItem(t.getStatus());
                }
            }
        };

    }

    private void updateModel(DefaultListModel model) {
        model.removeAllElements();
        model.addElement("+ Add Task");
        for (IData elem : myModel.tasks) {
            Task t = (Task) elem;
            model.addElement(t.getDescription());
        }

    }
}
