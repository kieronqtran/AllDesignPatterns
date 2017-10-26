package practice.observer.basic;

public class Observer {

  public void subscribe(Subject subject) {
    subject.getObservers().add(this);
  }

  public void beNotified(Subject subject) {
    System.out.println("State changes" + subject.getState());
  }
}
