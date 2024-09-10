fun main(){

    val obA =  A()
    val obB =  B()
}

open class A{
    public var p = 10 // used everywhere
    private var q = 10  // inside this class only
    internal var r = 10 // inside this module only
    protected var s = 10 // inside this class or its child class
}

class B: A(){

    fun test(){
        println(p)
       //  println(q) // as q is private it cant be used here
        println(r)
        println(s) // as Class B is child class of A , we can use this protected variable
    }
}