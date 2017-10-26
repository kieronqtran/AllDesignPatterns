package practice.memento;

import practice.memento.basic.Employee;

public class MementoExample {
  public static void main(String[] args) {
    System.out.println("Memento Example:");

    Employee employee = new Employee();

    employee.setName("This student's name.");
    employee.setAge(20);
    employee.backup();

    employee.setName("This is edited student name.");

    System.out.println("Before rollback.");
    System.out.println("Employee = [ name = " + employee.getName() + ", age = " + employee.getAge() + "]");

    employee.restore();
    System.out.println("After rollback.");
    System.out.println("Employee = [ name = " + employee.getName() + ", age = " + employee.getAge() + "]");
  }
}
