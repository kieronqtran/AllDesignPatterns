package practice.observer.basic;

import java.util.ArrayList;
import java.util.List;

public class Subject {
  private String state;

  private List<Observer> observers = new ArrayList<>();

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;

    for (Observer observer : this.observers) {
      observer.beNotified(this);
    }
  }

  public List<Observer> getObservers() {
    return observers;
  }

  public void setObservers(List<Observer> observers) {
    this.observers = observers;
  }
}
