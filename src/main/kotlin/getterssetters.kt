fun main (){

    val p1 = Person("shubham", 23)
    println(p1.age)
    p1.age = 25
    p1.age = -12
    println(p1.nameParam)
    println(p1.age)

//    val ob = calculator()
//    println(ob.add(2,5))
}

class Person(nameParam: String, ageParam: Int) {

    var nameParam: String = nameParam
        get() {
            println("Name getter is called")
            return field.toUpperCase()
        }
    var age: Int = ageParam
        set(value) {
            if (value > 0){
                field = value
            }
            else{
                println("Age cant be negative")
            }
        }
}

//class calculator{
//
//    lateinit var message: String
//
//    fun add(a: Int, b: Int): Int{
//        return a+b
//    }
//
//    fun multiply(a: Int, b:Int): Int{
//        return a*b
//    }
//}

