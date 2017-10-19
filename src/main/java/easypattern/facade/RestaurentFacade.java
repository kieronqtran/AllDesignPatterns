package easypattern.facade;

/**
 * Created by CoT on 10/16/17.
 */
public class RestaurentFacade {

    private Chef chef;
    private Waiter waiter;

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public RestaurentFacade(Chef chef, Waiter waiter) {
        this.chef = chef;
        this.waiter = waiter;
    }

    public void serveDish(){
        waiter.serveDish();
    }
    public void takeOrder(){
        waiter.takeOrder();
    }

    public void cook(){
        chef.cook();
    }
}
