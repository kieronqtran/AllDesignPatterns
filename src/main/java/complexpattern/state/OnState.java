package complexpattern.state;

/**
 * Created by CoT on 10/17/17.
 */
public class OnState implements State {
    public void press(Fan fan) {
        fan.setState(new OffState());
        System.out.println("Turn off");
    }
}
