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
        updateUserListModel(model);
        return model;

    }

    ActionListener getAddUserBtnListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User u = new User();
                u.setName(myView.userName.getText().trim());
                u.setSurname(myView.userSurname.getText().trim());
                u.setRank("" + myView.userRank.getSelectedItem());
                u.setTeam("" + myView.userTeam.getSelectedItem());
                u.setScrumUnits("" + myView.userScrumUnits.getValue());
                u.setUsername(myView.userUsername.getText().trim());
                u.setPassword(myView.userPassword.getText());
                myModel.addUser(u);
                myModel.users.add(u);
                myView.userList.setModel(getUserListModel());
            }
        };
    }

    ActionListener getUpdateUserBtnListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pos = myView.userList.getSelectedIndex() - 1;
                User u = (User) myModel.users.get(pos);
                u.setName(myView.userName.getText().trim());
                u.setSurname(myView.userSurname.getText().trim());
                u.setRank("" + myView.userRank.getSelectedItem());
                u.setTeam("" + myView.userTeam.getSelectedItem());
                u.setScrumUnits("" + myView.userScrumUnits.getValue());
                u.setUsername(myView.userUsername.getText().trim());
                u.setPassword(myView.userPassword.getText());
                myModel.updateUser(u);
                myModel.users.remove(pos);
                myModel.users.add(pos, u);
                myView.userList.setModel(getUserListModel());
            }
        };

    }

    ActionListener getRemoveUserBtnListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int del = myView.userList.getSelectedIndex() - 1;
                myModel.removeUser((User) myModel.users.get(del));
                myModel.users.remove(del);
                myView.userList.setModel(getUserListModel());

            }
        };
    }

    ListSelectionListener getUserListSelectionListener() {
        return new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (myView.userList.getSelectedIndex() == 0) {
                    myView.removeUserBtn.setEnabled(false);
                    myView.updateUserBtn.setEnabled(false);
                    myView.addUserBtn.setEnabled(true);
                    myView.userName.setText("");
                    myView.userScrumUnits.setValue(50);
                    myView.userPassword.setText("");
                    myView.userSurname.setText("");
                    myView.userUsername.setText("");
                } else if (myView.userList.getSelectedIndex() != -1) {
                    myView.addUserBtn.setEnabled(false);
                    myView.removeUserBtn.setEnabled(true);
                    myView.updateUserBtn.setEnabled(true);
                    User u = (User) myModel.users.get(myView.userList.getSelectedIndex() - 1);
                    myView.userName.setText(u.getName());
                    myView.userSurname.setText(u.getSurname());
                    myView.userRank.setSelectedItem(u.getRank());
                    myView.userTeam.setSelectedItem(u.getTeam());
                    myView.userScrumUnits.setValue(Integer.parseInt(u.getScrumUnits()));
                    myView.userUsername.setText(u.getUsername());
                    myView.userPassword.setText(u.getPassword());
                }

            }
        };

    }

    // TASKS TAB MODELS AND LISTENERS
    ListModel getTaskListModel() {
        DefaultListModel model = new DefaultListModel();
        updateTaskListModel(model);
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

    ListSelectionListener getTaskListSelectionListener() {
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

    private void updateTaskListModel(DefaultListModel model) {
        model.removeAllElements();
        model.addElement("+ Add Task");
        for (IData elem : myModel.tasks) {
            Task t = (Task) elem;
            model.addElement(t.getDescription());
        }

    }

    private void updateUserListModel(DefaultListModel model) {
        model.removeAllElements();
        model.addElement("+ Add User");
        for (IData elem : myModel.users) {
            User u = (User) elem;
            model.addElement(u.getName());
        }

    }
}
