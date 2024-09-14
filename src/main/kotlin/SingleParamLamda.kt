fun main(){

    calculator(1,2, {a, b -> a + b})
}

fun sumc(a: Int, b:Int) : Int = a + b
fun calculatorc(a: Int, b: Int, op : (Int, Int) -> Int): Int{
    return op(a, b)
}