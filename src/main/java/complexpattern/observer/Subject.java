package complexpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CoT on 10/16/17.
 */
public class Subject {

    private String state;

    List<Observer> observers = new ArrayList<Observer>();

    public void addMember(Observer observer){
        observers.add(observer);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;

        for(Observer observer: observers){
            observer.beingNotified();
        }

    }
}
