package easypattern.memento;

/**
 * Created by CoT on 10/16/17.
 */
public class Application {

    private String id;
    private String owner;
    private String state;
    private ApplicationMemento memento = new ApplicationMemento();

    public Application(String id, String owner, String state) {
        this.id = id;
        this.owner = owner;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void saveToMemento(){
        this.memento.setState(this.state);
    }

    public void restoreFromMemento(){
        this.state = this.memento.getState();
    }

}
