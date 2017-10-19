package complexpattern.decorator;

/**
 * Created by CoT on 10/16/17.
 */
public class LightDecorator implements Decorator {
    Decorator decorator;

    public LightDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public void decorate() {
        System.out.println("Light decorator");

        decorator.decorate();
    }
}
