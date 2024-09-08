fun main(){

    var car = AutoMobile("car", 4, 5, "petrol")
    var car2 = AutoMobile("car2", 4, 5, "petrol")


}

class AutoMobile(val name: String, val tyres: Int, val maxSeating: Int, val enginetype: String){  // primary constructors
 // if we don't write var or val , in constructor then it will simple parameter not property

    init{
        println("$name is created")
    }

    init {
        println("2nd init block")
    }

    var airBags = true
    fun drive(){}
    fun applyBrakes(){}

    constructor(nameParam: String, engineParam: String) :
            this(nameParam, 4, 5, engineParam)
}

//class empty{}
//
//class Person(nameParam : String, ageParam:Int)
//{
//
//
//    val name: String = "$nameParam - clan"
//    var age : Int = ageParam
//}
