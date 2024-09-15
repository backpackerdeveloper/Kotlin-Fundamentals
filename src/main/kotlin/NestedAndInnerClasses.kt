fun main(){

    val obj = Outer()
    obj.i
//
//    val nested = Outer.Nested()
//    nested.test()

    val inner = Outer().Nested()
    inner.test()
}

class Outer{

    var i = 0

    inner class Nested{
        fun test(){
            println("I AM IN inner class $i")
        }
    }
}