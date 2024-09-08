import java.util.Objects

fun main(){
    dragObjects(arrayOf(CIRCLE(4.0), SQUARE(4.0), TRAINGLE(2.0,3.0), Player("Shubham")))
}


fun dragObjects(objects: Array<Draggable>){

   for (obj in objects){
       obj.drag()
   }
}

interface Draggable{
    fun drag()
}


abstract class SHAPE :Draggable{
    abstract fun area(): Double

}

class CIRCLE(val radius: Double): SHAPE(){
    override fun area(): Double =  Math.PI * radius * radius
    override fun drag()  = println("Circle is dragging")

}

class SQUARE(val side: Double): SHAPE(){
    override fun area(): Double  =  side * side
    override fun drag()  = println("square is dragging")
}


class TRAINGLE(val base: Double, val height: Double): SHAPE(){
    override fun area(): Double  =  0.5 * base * height
    override fun drag()  = println("Triangle is dragging")
}

class Player(val name: String): Draggable{
    override fun drag() = println("$name is dragging")
}