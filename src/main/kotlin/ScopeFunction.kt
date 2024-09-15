fun main(){

    val emp = Employee()
    emp.age = 20
    emp.name = "Jhon"

    emp.apply { // here using apply we don't need to write emp.age = 20 multiple time under this apply function we can assign values directly
        age = 30
        name = "sean"
    }

    println(emp.age)
    println(emp.name)
    // to get access values we to write multiple time emp.name, so simple this we let function
    emp.let {
        println(it.name)
        println(it.age)
    }

    with(emp){
        age = 30
        name = "xyz"
    }

    emp.run {
        age = 35
        name = "PQR"
    }

}

data class Employee(var name: String = "", var age: Int = 18)