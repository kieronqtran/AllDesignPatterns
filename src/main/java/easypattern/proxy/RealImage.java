package easypattern.proxy;

/**
 * Created by CoT on 10/16/17.
 */
public class RealImage implements Image {
    public void show() {
        System.out.println("Showing real image");
    }
}
