package practice.factory.basic;

// could be normal class or abstract class or interface
public abstract class Product {
  public abstract double getPrice();

  public String getProductType() {
    return "Unknown Product";
  }
}
