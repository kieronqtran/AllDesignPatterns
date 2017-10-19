package easypattern.proxy;

/**
 * Created by CoT on 10/16/17.
 */
public class ProxyImage implements Image {
    private Image realImage;
    public void show() {
        System.out.println("Loading real image, please wait");
        realImage = new RealImage();
        realImage.show();
    }
}
