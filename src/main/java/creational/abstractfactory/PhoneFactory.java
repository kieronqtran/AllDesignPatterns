package creational.abstractfactory;

/**
 * Created by CoT on 10/16/17.
 */
public class PhoneFactory implements ProductFactory {
    public Product create() {
        return new Phone();
    }
}
