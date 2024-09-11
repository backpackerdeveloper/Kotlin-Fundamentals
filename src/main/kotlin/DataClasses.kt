fun main(){

    val p1 = Person2(1, "Jhon")
    val p2 = Person2(2, "Shubham")

    val p3 = p1.copy(id = 3) // copy method we can use data class to make copy with chnages too
    println(p3)
    val(id:Int, name: String) = p1
    println(id)
    println(name)

}

data class Person2(val id: Int, val name: String)
{

}