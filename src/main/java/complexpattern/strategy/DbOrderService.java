package complexpattern.strategy;

/**
 * Created by CoT on 10/16/17.
 */
public class DbOrderService implements OrderService {
    public void saveOrder() {
        System.out.println("Save order into DB");
    }
}
