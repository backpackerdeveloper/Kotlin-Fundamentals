fun main(){

    val objC = Child()

    objC.myMethod()
    objC.myMethod2()

}

open class Parent
{

    init {
        println("Parent constructor initialize")
    }
    val name : String = ""

    fun myMethod(){
        println("I am in Parent")
    }
}

class Child : Parent(){

    init {
        println("Child constructor initialize")
    }

    val name2 : String = ""

    fun myMethod2(){
        println("I am in Child")
    }
}