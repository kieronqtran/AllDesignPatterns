# Builder Pattern

## Definition

## Example
[Java Builder Example](BuilderExample.java#L7)

```Java
Employee newEmployee = new Employee
  .Builder("helloworld@gmail.com") // Have to fill in required field
  .firstName("Mark") // Optional Field
  .lastName("Zuckerberg")
  .phone("0123456789")
  .age(18)
  .address("123 Nguyen Du")
  .build(); // Validate the input value when return new instance
```
