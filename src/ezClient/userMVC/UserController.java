/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient.userMVC;

import ezCommon.Task;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
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
}
