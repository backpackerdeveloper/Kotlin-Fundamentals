fun main (){

    val circle = Circlek(4.0)
    println(circle.area())
    circle.display()
}

abstract class Shapek{
    var name: String = ""
    abstract fun area() : Double
    abstract fun display()
}

class Circlek(val radius: Double) : Shapek(){

    override fun area(): Double = Math.PI * radius * radius
    override fun display() {
        println("Circle is displayed")
    }
}