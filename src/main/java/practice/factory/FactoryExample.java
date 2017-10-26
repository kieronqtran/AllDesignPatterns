package practice.factory;

import practice.factory.basic.Bike;
import practice.factory.basic.Car;
import practice.factory.basic.Product;
import practice.factory.basic.ProductFactory;

public class FactoryExample {

  public static void main(String[] args) {
    System.out.println("Factory Example:");
    ProductFactory productFactory = new ProductFactory();

    Car car = productFactory.createProduct(Car.class);
    Bike bike = productFactory.createProduct(Bike.class);
    Product car2 = productFactory.createProduct(Car.class);

    System.out.println("Car: " + car);
    System.out.println("Car 2: " + car2);
    System.out.println("Bike: " + bike);
  }
}
