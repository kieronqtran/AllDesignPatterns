package practice.proxy.basic2;

public class ActualImage implements Image {
  @Override
  public void display() {
    System.out.println("Display the real image.");
  }
}
