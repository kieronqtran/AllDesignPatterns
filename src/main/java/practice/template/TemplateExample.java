package practice.template;

import practice.template.basic.Animal;
import practice.template.basic.Cat;
import practice.template.basic.Dog;

public class TemplateExample {
  public static void main(String[] args) {
    System.out.println("Template Example:");

    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal[] animals = {dog, cat};

    for (Animal animal : animals) {
      animal.live();
    }
  }
}
