package practice.template.basic;

public class Cat extends Animal {

  @Override
  public void eat() {
    System.out.println("Cat eats mice.");
  }

  @Override
  public void drink() {
    System.out.println("Cat drinks milk.!");
  }
}
