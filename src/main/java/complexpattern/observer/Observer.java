package complexpattern.observer;

/**
 * Created by CoT on 10/16/17.
 */
public class Observer {

    public void subscribe(Subject subject){
        subject.addMember(this);
    }

    public void beingNotified(){
        System.out.println("I am notified");
    }
}
