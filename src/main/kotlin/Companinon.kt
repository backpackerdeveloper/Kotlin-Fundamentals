fun main(){

    MyClass.f()
    MyClass.AnotherObject.g()
}

class MyClass{
    companion object MyObject{
        fun f(){
            println("Hello i am from F Object")
        }
    }

    object AnotherObject{
        fun g(){
            println("Hello i am from G from another object")
        }
    }
}