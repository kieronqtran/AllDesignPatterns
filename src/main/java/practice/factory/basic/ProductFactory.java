package practice.factory.basic;

public class ProductFactory {
  public <T extends Product> T createProduct(Class<T> productType) {
    if (Car.class.isAssignableFrom(productType)) {
      return productType.cast(new Car());
    }
    if (Bike.class.isAssignableFrom(productType)) {
      return productType.cast(new Bike());
    }
    return null;
  }
}
