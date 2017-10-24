package practice.builder.basic;

public class Employee {
  private final String email; // Required
  private final String firstName; // Optional
  private final String lastName; // Optional
  private final int age; // Optional
  private final String phone; // Optional
  private final String address; // Optional

  private Employee(Builder builder) {
    this.email = builder.email;
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.phone = builder.phone;
    this.address = builder.address;
  }

  public String getEmail() {
    return email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public int getAge() {
    return age;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  public static class Builder {
    private String email = "";
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private String phone = "";
    private String address = "";

    public Builder(String email) {
      this.email = email;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Employee build() {
      // Validate for return a new instance of an object.
      if(age > 120 || age <0) {
        throw new IllegalArgumentException("Age Can't be negative");
      }

      return new Employee(this);
    }
  }
}
