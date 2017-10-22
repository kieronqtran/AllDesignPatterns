package easypattern;

import easypattern.facade.Chef;
import easypattern.facade.RestaurantFacade;
import easypattern.facade.Waiter;
import easypattern.flyweight.Student;
import easypattern.flyweight.University;
import easypattern.flyweight.UniversityPool;
import easypattern.memento.Application;
import easypattern.proxy.Image;
import easypattern.proxy.ProxyImage;
import easypattern.template.Admission;
import easypattern.template.ExchangeAdmission;
import easypattern.template.LocalAdmission;

/**
 * Created by CoT on 10/16/17.
 */
public class Main {

  public static void main(String[] args) {

    // Template method
    Admission exchangeAdmission = new ExchangeAdmission();
    exchangeAdmission.verify();

    Admission localAdmission = new LocalAdmission();
    localAdmission.verify();

    // Facade
    RestaurantFacade restaurant = new RestaurantFacade(new Chef(), new Waiter());
    restaurant.takeOrder();
    restaurant.cook();
    restaurant.serveDish();

    // Memento
    Application application = new Application("12345", "Henry Ng", "open");
    application.saveToMemento();
    application.setState("review");
    application.restoreFromMemento();
    System.out.println(application.getState());

    // Flyweight
    University rmit = UniversityPool.getUniversity("rmit");
    Student student1 = new Student("Henry Ng", rmit);
    Student student2 = new Student("Tim Cook", UniversityPool.getUniversity("rmit"));

    // Proxy
    Image image = new ProxyImage();
    image.show();

  }
}
