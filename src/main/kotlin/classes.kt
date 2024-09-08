fun main(){

    val mustang = Car("mustang", "petrol", 100)
    val lotus = Car("lotus", "diesel", 200)

    println(mustang.name)
    println(lotus.kmRan)

    mustang.driveCar()

}

class Car (val name : String, val type : String, var kmRan: Int) // properties
{
    fun driveCar(){
        println("$name Car is Driving")
    }

    fun applyBreak(){
        println("Applied Brakes")
    }

}