/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient.adminMVC;

import ezCommon.Task;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.ListModel;

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
        myView.run();
    }

    //USERS TAB MODELS AND LISTENERS
    ComboBoxModel getUserRankModel() {
        return new javax.swing.DefaultComboBoxModel(myModel.getRanks());
    }

    ComboBoxModel getUserTeamModel() {
        return new javax.swing.DefaultComboBoxModel(myModel.getTeams());
    }

    ListModel getUserListModel() {
        return null;

    }

    ActionListener getAddUserBtnListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ActionListener getUpdateUserBtnListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ActionListener getRemoveUserBtnListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // TASKS TAB MODELS AND LISTENERS
    ListModel getTaskListModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ComboBoxModel getTaskPriorityModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ComboBoxModel getTaskStausModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ActionListener getAddTaskBtnListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ActionListener getUpdateTaskBtnListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ActionListener getRemoveTaskBtnListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myModel.removeTask((Task) myModel.tasks.get(myView.taskList.getSelectedIndex()));

            }
        };
    }
}
