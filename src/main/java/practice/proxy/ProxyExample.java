package practice.proxy;

import practice.proxy.basic2.Image;
import practice.proxy.basic2.ProxyImage;

public class ProxyExample {
  public static void main(String[] args) {
    System.out.println("Proxy Example:");

//    Student student = new Student();
//
//    University rmit = UniversityCache.getUniversity("rmit", "RMIT Vietnam");
//    student.setUniversity(rmit);
//    System.out.println(student.getUniversity().getName());
//
//    Student student1 = new Student();
//    student1.setUniversity(UniversityCache.getUniversity("tdt", "Ton Duc Thang"));
//
//    Student student2 = new Student();
//    student2.setUniversity(UniversityCache.getUniversity("rmit", ""));


    System.out.println("Example 2:");
    Image image = new ProxyImage();
    image.display();
  }
}
