package practice.template.basic;

public abstract class Animal {

  public abstract void eat();

  public abstract void drink();

  public void live() {
    eat();
    drink();
  }

}
