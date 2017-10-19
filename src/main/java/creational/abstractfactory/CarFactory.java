package creational.abstractfactory;

/**
 * Created by CoT on 10/16/17.
 */
public class CarFactory implements ProductFactory {
    public Product create() {
        return new Car();
    }
}
