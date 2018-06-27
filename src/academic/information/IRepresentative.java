/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academic.information;

/**
 *
 * @author asif
 */
public interface IRepresentative {
    void register(Observer o);
    void unregister(String code);
    void notifyObservers(String code);
}
