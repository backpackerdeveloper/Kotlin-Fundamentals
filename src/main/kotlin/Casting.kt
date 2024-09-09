fun main(){

    val circle = CIRCLE2(4.0)
    val player = Player2("Shubham")

    val arr: Array<Draggabl> = arrayOf(circle, player)
    for (obj in arr){
        if (obj is CIRCLE2){
            println(obj.area())
        }
        else{
            (obj as Player2).satMyName()
        }
    }


}

interface Draggabl{
    fun drag()
}


abstract class SHAPE2 :Draggabl{
    abstract fun area(): Double

}

class CIRCLE2(val radius: Double): SHAPE2(){
    override fun area(): Double =  Math.PI * radius * radius
    override fun drag()  = println("Circle is dragging")

}

class Player2(val name: String): Draggabl{
    override fun drag() = println("$name is dragging")
    fun satMyName() = println("Hey my name is - $name")
}