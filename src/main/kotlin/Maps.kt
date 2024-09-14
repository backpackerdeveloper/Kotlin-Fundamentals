fun main(){

    val students = mutableMapOf<Int, String>()
    students.put(1, "Rayan")
    students.put(2, "Jhon")
    students.put(3, "Kattie")

    println(students.get(1))
    println(students.get(11))

    for((key, value ) in students){
        println("$key = $value")
    }

    students[8] = "Jones"
    println(students[8])

    val map = mapOf<Int, String>(1 to "Hello", 2 to "World")
    println(map)
}