package practice.observer;

import practice.observer.basic.Observer;
import practice.observer.basic.Subject;

public class ObserverExample {
  public static void main(String[] args) {
    System.out.println("Observer Example:");

    Subject subject = new Subject();
    Observer observer1 = new Observer();
    Observer observer2 = new Observer();

    observer1.subscribe(subject);
    observer2.subscribe(subject);

    subject.setState("SADI tests in week 4.");
  }
}
