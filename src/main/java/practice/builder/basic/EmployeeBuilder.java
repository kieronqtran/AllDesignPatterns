package practice.builder.basic;

public class EmployeeBuilder {
  private String id;
  private String name;
  private double salary;

  public EmployeeBuilder setId(String id) {
    this.id = id;
    return this;
  }

  public EmployeeBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public EmployeeBuilder setSalary(double salary) {
    this.salary = salary;
    return this;
  }

  public practice.builder.basic.Employee build() {
    return new practice.builder.basic.Employee(id, name, salary);
  }
}
