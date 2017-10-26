package practice.factory.basic;

public class Bike extends Product {
  @Override
  public double getPrice() {
    return 10000;
  }

  @Override
  public String getProductType() {
    return "Bike";
  }
}
