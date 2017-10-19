package creational.builder;

/**
 * Created by CoT on 10/16/17.
 */
public class EmployeeBuilder {

    Employee employee = new Employee();

    public EmployeeBuilder setName(String name){
        employee.setName(name);
        return this;
    }

    public EmployeeBuilder setId(String id){
        employee.setId(id);
        return this;
    }

    public EmployeeBuilder setSalary(double salary){
        employee.setSalary(salary);
        return this;
    }

    public Employee build(){
        return employee;
    }
}
