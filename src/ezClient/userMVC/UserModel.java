package ezClient.userMVC;

import ezClient.IClientObserver;
import ezClient.IClientSubject;
import ezCommon.User;

/**
 *
 * @author Andrei
 */
public class UserModel implements IClientSubject {

    private User user;

    public UserModel(User usr) {
        user = usr;
    }

    @Override
    public void registerObserver(IClientObserver o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver(IClientObserver o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
