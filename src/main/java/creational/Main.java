package creational;

import creational.abstractfactory.*;
import creational.builder.Employee;
import creational.builder.EmployeeBuilder;
import creational.factory.Patient;
import creational.factory.PatientFactory;
import creational.prototype.Order;
import creational.singleton.Singleton;

import java.util.Date;

/**
 * Created by CoT on 10/16/17.
 */
public class Main {
    public static void main(String[] args){
        //Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.hello();


        //Factory method
        Patient patient = PatientFactory.create();
        patient.setName("Henry");

        //Abstract factory
        PhoneFactory phoneFactory = new PhoneFactory();
        Product phone = phoneFactory.create();

        CarFactory carFactory = new CarFactory();
        Product car = carFactory.create();

        //Builder
        EmployeeBuilder employeeBuilder =  new EmployeeBuilder();
        Employee employee = employeeBuilder.setId("s12345").setName("Henry").setSalary(20000000).build();
        System.out.println(employee.getName());

        //Prototype
        Order order = new Order("12345", new Date(), "Henry Nguyen");

        try {
            Order order2 = order.clone();
            order2.setCustomer("Henry Le");
            System.out.println(order.getCustomer());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
