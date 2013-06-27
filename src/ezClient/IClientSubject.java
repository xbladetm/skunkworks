/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezClient;

/**
 *
 * @author Andrei
 */
public interface IClientSubject {

    public void registerObserver(IClientObserver o);

    public void removeObserver(IClientObserver o);

    public void notifyObservers();
}
