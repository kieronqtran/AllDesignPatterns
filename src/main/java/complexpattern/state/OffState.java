package complexpattern.state;

/**
 * Created by CoT on 10/17/17.
 */
public class OffState implements State {
    public void press(Fan fan) {
        fan.setState(new OnState());
        System.out.println("Turn on");
    }
}
