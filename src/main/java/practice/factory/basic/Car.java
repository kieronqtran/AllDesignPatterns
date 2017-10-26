package practice.factory.basic;

public class Car extends Product {
  private double price = 2000;

  public Car() {

  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public String getProductType() {
    return "Car";
  }
}
