fun main(){

    var gender: String = "Male"
    var gender2: String? = null // ? operator means, now we accept any value with null value also
    var isAdult: Boolean? = null

    if (gender2 != null){
        println(gender2.uppercase())
    }

    println(gender2?.toUpperCase())

    gender2.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line $it")
    }

    var selectedValue = gender2 ?: "NA"
    var value = gender2!!.toUpperCase()
}