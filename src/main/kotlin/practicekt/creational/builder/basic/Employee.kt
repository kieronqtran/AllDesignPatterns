package practicekt.creational.builder.basic


class Employee private constructor(val id: String, val name: String, val salary: Double) {
  class EmployeeBuilder {
    var id: String
    var name: String
    var salary: Double

    constructor(
      id: String = "0",
      name: String = "",
      salary: Double = 0.toDouble(),
      init: EmployeeBuilder.() -> Unit
    ) {
      this.id = id
      this.name = name
      this.salary = salary
      init()
    }

    fun build(): Employee = Employee(this.id, this.name, this.salary)
  }

  companion object {
    fun build(id: String = "0", name: String = "", salary: Double = 0.toDouble(), init: EmployeeBuilder.() -> Unit)
      = EmployeeBuilder(id, name, salary, init).build()
  }
}

