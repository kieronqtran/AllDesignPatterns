package practice.singleton.basic;

public class EmployeeService {
  private static EmployeeService service = new EmployeeService();

  private EmployeeService() {

  }

  public static EmployeeService getInstance() {
    return service;
  }


}
