package practice.template.basic;

public class Dog extends Animal {

  @Override
  public void eat() {
    System.out.println("Dog eats bone.");
  }

  @Override
  public void drink() {
    System.out.println("Dog drinks water.");
  }
}
