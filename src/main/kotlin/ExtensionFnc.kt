fun main(){

    println("Hello shubham".formattedString())

}

fun String.formattedString() : String{
    return "----------------\n$this\n----------------"
}