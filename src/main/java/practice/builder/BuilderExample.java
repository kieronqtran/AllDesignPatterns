package practice.builder;

import practice.builder.basic.Employee;
public class BuilderExample {
  public static void main(String[] args) {
    System.out.println("Builder Example:");

//    Employee mark = new EmployeeBuilder()
//      .setId("1")
//      .setName("Mark Zuckerberg")
//      .setSalary(400000)
//      .build();
//
//    System.out.println("mark = " + mark);
//    System.out.println("id = [" + mark.getId() + "]");
//    System.out.println("name = [" + mark.getName() + "]");
//    System.out.println("salary = [" + mark.getSalary() + "]");

    Employee newEmployee = new Employee
      .Builder("helloworld@gmail.com")
      .firstName("Mark")
      .lastName("Zuckerberg")
      .phone("0123456789")
      .age(18)
      .address("123 Nguyen Du")
      .build();

    System.out.println("newEmployee = [" + newEmployee + "]");
    System.out.println("email = [" + newEmployee.getEmail() + "]");
    System.out.println("full-name = [" + newEmployee.getFullName() + "]");
    System.out.println("phone = [" + newEmployee.getPhone() + "]");
    System.out.println("age = [" + newEmployee.getAge() + "]");
    System.out.println("address = [" + newEmployee.getAddress() + "]");

  }
}
