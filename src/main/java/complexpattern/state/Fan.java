package complexpattern.state;

/**
 * Created by CoT on 10/17/17.
 */
public class Fan {

    private State state =  new OnState();

    public void press(){
        state.press(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
