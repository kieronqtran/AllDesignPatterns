package practice.builder;

import practicekt.creational.builder.BuilderExampleKotlin;
import practice.builder.basic.Employee;
import practice.builder.basic.EmployeeBuilder;

public class BuilderExample {
  public static void main(String[] args) {
    System.out.println("Builder Example:");

    Employee mark = new EmployeeBuilder()
      .setId("1")
      .setName("Mark Zuckerberg")
      .setSalary(400000)
      .build();

    System.out.println("mark = " + mark);
    System.out.println("id = [" + mark.getId() + "]");
    System.out.println("name = [" + mark.getName() + "]");
    System.out.println("salary = [" + mark.getSalary() + "]");

    BuilderExampleKotlin.run();
  }
}
