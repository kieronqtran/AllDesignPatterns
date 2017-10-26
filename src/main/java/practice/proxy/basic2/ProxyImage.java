package practice.proxy.basic2;

public class ProxyImage implements Image {
  private Image actualImage = new ActualImage();

  public ProxyImage() {
  }

  @Override
  public void display() {
    System.out.println("This is the proxy. Wait for the real image.");
    try {
      Thread.sleep(2000);
      this.actualImage.display();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
