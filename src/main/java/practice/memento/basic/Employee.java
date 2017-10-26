package practice.memento.basic;

public class Employee {
  private String name;
  private int age;

  private EmployeeMemento employeeMemento = new EmployeeMemento();

  public Employee() {
  }

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void backup() {
    this.employeeMemento.setName(this.name);
    this.employeeMemento.setAge(this.age);
  }

  public void restore() {
    this.name = this.employeeMemento.getName();
    this.age = this.employeeMemento.getAge();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
