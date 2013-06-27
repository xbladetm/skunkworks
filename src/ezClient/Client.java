/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient;

import ezClient.adminMVC.AdminView;
import ezClient.adminMVC.AdminController;
import ezClient.adminMVC.AdminModel;
import ezClient.userMVC.UserController;
import ezClient.userMVC.UserModel;
import ezClient.userMVC.UserView;
import ezCommon.User;

/**
 *
 * @author Andrei
 */
public class Client {

    public void runAdminMVC(User user) {
        AdminModel model = new AdminModel(user);
        AdminView view = new AdminView();
        AdminController controller = new AdminController();

        model.registerObserver((IClientObserver) view);
        controller.addModel(model);
        view.addController(controller);
        controller.addView(view);
        controller.runView();
    }

    public void runUserMVC(User user) {
        UserModel model = new UserModel(user);
        UserView view = new UserView();
        UserController controller = new UserController();

        model.registerObserver((IClientObserver) view);
        controller.addModel(model);
        view.addController(controller);
        controller.addView(view);
        controller.runView();
    }

    public static void main(String params[]) {
        //TODO MAKE LOGIN RETURN USER INSTEAD OF RANK TO BE USED IN THE MODEL LATER.
        LoginDialog login = new LoginDialog(null);
        login.setVisible(true);
        User user = login.getLoginUser();
        Client c = new Client();
        if (user.getRank().equals("ADMIN")) {
            c.runAdminMVC(user);
        } else {
            c.runUserMVC(user);
        }
    }
}
