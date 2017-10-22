package practicekt.creational.builder

import practicekt.creational.builder.basic.Employee

public class BuilderExampleKotlin {
  companion object {
      @JvmStatic
      fun run() {
        println("Kotlin Builder Example:")
        var mark: Employee = Employee.build {
          id = "2"
          name = "Mark"
          salary = 1000.toDouble()
        }

        println("Employees = [$mark]")
        println("id = [${mark.id}]")
        println("name = [${mark.name}]")
        println("salary = [${mark.salary}]")
      }
  }
}
