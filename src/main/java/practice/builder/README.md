# Builder Pattern

[Java Builder Example](https://github.com/kieronqtran/AllDesignPatterns/blob/master/src/main/java/practice/builder/BuilderExample.java#L7)

```Java
Employee newEmployee = new EmployeeBuilder()
      .setId("1")
      .setName("Mark Zuckerberg")
      .setSalary(400000)
      .build();
```

[Kotlin Builder Example](https://github.com/kieronqtran/AllDesignPatterns/blob/master/src/main/kotlin/practicekt/creational/builder/basic/Employee.kt#L5)

```Kotlin
val newEmployee: Employee = Employee.build {
  id = "1"
  name = "EmployeeName"
  salary = 1000.0
 }
```
