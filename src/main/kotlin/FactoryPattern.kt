fun main(){

    var pizza1 = Pizza.Factory.create("Peppy Panner")
    println(pizza1)

    var pizza2: Pizza = Pizza.create("Tomato")
    println(pizza2)


   // var pizza = Pizza()

}

class Pizza private constructor(val type: String, val toppings: String){
    companion object Factory{
        fun create(pizzaType: String): Pizza{
            return when(pizzaType){
                "Tomato" -> Pizza("Tomato", "cheese")
                "Peppy Panner" -> Pizza("Panner Farm", "Paneer, cheese burst, Tomato, onion")
                else ->Pizza("Basic", "Onion, cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza( type = '$type', toppings='$toppings')"
    }
}