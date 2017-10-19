package complexpattern.mediator;

/**
 * Created by CoT on 10/16/17.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void send(String msg){
        Mediator.sendMessage(this, msg);
    }
}
