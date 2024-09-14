fun main(){

    var fn: (a: Int, b: Int) -> Int = :: sum

    val  lamda1 = {x :Int, y: Int -> x + y}
    val multiLineLambdas = {
        println("Hello world")
        val a = 2 + 3
        "Hello Shubham"
        2
    }

    val singleparamLamda = {x: Int -> x * x}
    val lambda2 : (Int) -> Int = {x -> x * x}

    val sayHi = {msg: String -> println("Hello $msg") }
    val sayHi2: (String) -> Unit = {msg -> println("Hello $msg") }

    println(multiLineLambdas)

}

fun sum(a: Int, b:Int) : Int = a + b

fun calculator(a: Int, b: Int, op : (Int, Int) -> Int): Int{
    return op(a, b)
}